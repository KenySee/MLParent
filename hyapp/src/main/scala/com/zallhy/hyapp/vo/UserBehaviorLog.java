package com.zallhy.hyapp.vo;

public class UserBehaviorLog {
    /***
     * 手机IMEI码
     */
    public String sourceId;


    /***
     * 物品ID
     */
    public String targetId;


    /***
     * 事件类型(0:浏览,1:查看,2:搜索,3:关注,分享,4:加购物车,5:购买,6:评价)
     */
    public Integer eventType;

    /**
     * 时间
     */
    public Long eventTime;

    public UserBehaviorLog(){}

    public UserBehaviorLog(String sourceId,String targetId,Integer eventType){
        this.sourceId = sourceId;
        this.targetId = targetId;
        this.eventType = eventType;
    }
}
