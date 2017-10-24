package com.zallhy.hyapp.utils;

import com.zallhy.hyapp.tables.AppUserRecommend;
import com.zallhy.hyapp.tables.records.AppUserRecommendRecord;
import com.zallhy.hyapp.tables.records.AppUserSimilarRecord;
import org.apache.commons.collections.map.HashedMap;
import org.jooq.DSLContext;
import org.jooq.Record;

import java.util.*;

public class RecommendCalc {
    private Map<String,UserModel> instanceMap = new HashMap<>();
    private List<UserModel> modelList = new ArrayList<>();
    private UserModel fetchModel(String id){
        UserModel model = instanceMap.get(id);
        if(model == null){
            model = new UserModel(id);
            instanceMap.put(id,model);
            for(UserModel child : modelList){
                child.addChild(model);
            }
            modelList.add(model);
        }
        return model;
    }
    class UserModel {
        //兴趣列表Map
        private Map<String,Record> interestMap = new HashedMap();
        //兴趣列表List
        private List<Record> interestList = new ArrayList<>();

        //子列表List
        private List<UserModel> childList = new ArrayList<>();

        //相似列表
        private List<AppUserSimilarRecord> similarList = new ArrayList<>();

        //推荐列表
        private Map<String,Double> recommendMap = new HashedMap();

        //用户ID
        private String sourceId;

        public UserModel(String id){
            this.sourceId = id;
        }

        private String getId(){
            return this.sourceId;
        }

        private void buildUserSimilarList(){
            childList.forEach(child -> {
                double similar = CompareTo(child);
                if(similar > 0) {
                    this.addSimilar(sourceId,child.getId(),similar);
                    UserModel model = fetchModel(child.getId());
                    model.addSimilar(child.getId(),sourceId,similar);
                }
            });
        }
        private void buildUserRecommendList(){
            Arrays.stream(similarList.toArray()).sorted((person1, person2)->{
                AppUserSimilarRecord o1 = (AppUserSimilarRecord)person1;
                AppUserSimilarRecord o2 = (AppUserSimilarRecord)person2;
                return o1.getSimilar() > o2.getSimilar() ? -1 : 1;
            }).forEach(r -> {
                if(recommendMap.size() >= 50) return;
                AppUserSimilarRecord o = (AppUserSimilarRecord)r;
                UserModel model = fetchModel(o.getPeerid());
                List<AppUserRecommendRecord> list = model.getInterestList(sourceId,interestMap);
                list.forEach(l -> {
                    addRecommend(sourceId,l.getItemid(),l.getSimilar());
                });
            });
        }
        private void putRecommendList(List<AppUserRecommendRecord> records){
            Iterator<String> iterator = this.recommendMap.keySet().iterator();
            while (iterator.hasNext()){
                String itemid = iterator.next();
                Double similar = recommendMap.get(itemid);
                records.add(new AppUserRecommendRecord(sourceId,itemid,similar));
            }
        }
        private List<AppUserRecommendRecord> getInterestList(String userId,Map<String,Record> targetMap){
            List<AppUserRecommendRecord> list = new ArrayList<>();
            interestList.forEach(r -> {
                String targetId = r.get("targetId",String.class);
                Integer similar = r.get("similar",Integer.class);
                Record item = targetMap.get(r.get("targetId",String.class));
                if(item == null && list.size() < 10){
                    list.add(new AppUserRecommendRecord(userId,targetId,Double.valueOf(similar)));
                }
            });
            return list;
        }

        private void addInterest(String sourceId,String targetId,Record rs){
            interestMap.put(targetId,rs);
            interestList.add(rs);
        }

        private void addChild(UserModel child){
            childList.add(child);
        }

        private void addSimilar(String userId,String peerId,double similar){
            similarList.add(new AppUserSimilarRecord(userId,peerId,similar));
        }

        private void addRecommend(String userId,String itemId,double similar){
            Double value = recommendMap.get(itemId);
            if(value == null){
                if(recommendMap.size() < 50){
                    recommendMap.put(itemId,Double.valueOf(similar));
                }
            }
            else{
                recommendMap.put(itemId,value+similar);
            }
        }
        //计算余弦相似度
        private double CompareTo(UserModel other){
            Map<String, int[]> AlgorithmMap = new HashMap<String, int[]>();
            Iterator<String> iterator1 = this.interestMap.keySet().iterator();
            while(iterator1.hasNext()){
                Record r = this.interestMap.get(iterator1.next());
                String key = r.get("targetId",String.class);
                int num = r.get("similar",Integer.class);
                int[] fq = AlgorithmMap.get(key);

                if(fq != null && fq.length == 2){
                    fq[0] += num;
                }
                else{
                    fq = new int[2];
                    fq[0] = num;
                    fq[1] = 0;
                    AlgorithmMap.put(key,fq);
                }
            };
            Iterator<String> iterator2 = other.interestMap.keySet().iterator();
            while(iterator2.hasNext()){
                Record r = other.interestMap.get(iterator2.next());
                String key = r.get("targetId",String.class);
                int num = r.get("similar",Integer.class);
                int[] fq = AlgorithmMap.get(key);

                if(fq != null && fq.length == 2){
                    fq[1] += num;
                }
                else{
                    fq = new int[2];
                    fq[0] = 0;
                    fq[1] = num;
                    AlgorithmMap.put(key,fq);
                }
            };
            Iterator<String> iterator3 = AlgorithmMap.keySet().iterator();
            double sqdoc1 = 0;
            double sqdoc2 = 0;
            double denominator = 0;
            while(iterator3.hasNext()){
                int[] c = AlgorithmMap.get(iterator3.next());
                denominator += c[0]*c[1];
                sqdoc1 += c[0]*c[0];
                sqdoc2 += c[1]*c[1];
            }
            return denominator / Math.sqrt(sqdoc1*sqdoc2);//余弦计算
        }
    }
    public void run(DSLContext jooq,String userId){
        String subSQL = "SELECT sourceId,targetId,SUM(IF(POW(eventType,2)<DATEDIFF(NOW(),eventTime),0,POW(eventType,2)-DATEDIFF(NOW(),eventTime))) as similar\n" +
                "FROM app_event_log GROUP BY sourceId,targetId";
        String formSQL = String.format("SELECT * FROM (%s) a WHERE a.similar > 0 ORDER BY a.sourceId,a.similar desc",subSQL);
        jooq.fetch(formSQL)
                .forEach(rs ->{
                    String sourceId = rs.get("sourceId",String.class);
                    String targetId = rs.get("targetId",String.class);
                    UserModel model = fetchModel(sourceId);
                    model.addInterest(sourceId,targetId,rs);
                });
        UserModel current = null;
        for(UserModel child : modelList){
            child.buildUserSimilarList();
            if(userId.equals(child.getId())){
                current = child;
            }
        }
        if(current != null){
            List<AppUserRecommendRecord> records = new ArrayList<>();
            current.buildUserRecommendList();
            current.putRecommendList(records);
            jooq.deleteFrom(AppUserRecommend.APP_USER_RECOMMEND).where(String.format("userid='%s'",userId)).execute();
            records.forEach(r -> {
                jooq.insertInto(AppUserRecommend.APP_USER_RECOMMEND).set(r).execute();
            });
        }
    }
}
