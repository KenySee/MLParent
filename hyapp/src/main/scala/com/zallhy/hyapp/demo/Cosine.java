package com.zallhy.hyapp.demo;

import com.zallhy.hyapp.utils.ImageTools;
import org.ansj.domain.Result;
import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.ToAnalysis;
import org.apache.commons.collections.IteratorUtils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by hadoop on 2017/9/26.
 */
public class Cosine {

    public static double getSimilarity(String doc1, String doc2) {
        if (doc1 != null && doc1.trim().length() > 0 && doc2 != null&& doc2.trim().length() > 0) {

            Map<String, int[]> AlgorithMap = new HashMap<String, int[]>();
            List<String> termList1 = new ArrayList<>();
            List<String> termList2 = new ArrayList<>();
            ToAnalysis.parse(doc1).forEach(term->{
                String str = term.natrue().natureStr;
                if("n".equals(str) || "nr".equals(str)){
                    termList1.add(term.getName());
                }
            });
            ToAnalysis.parse(doc2).forEach(term->{
                String str = term.natrue().natureStr;
//                if(!"w".equals(str) && !"null".equals(str) && !"m".equals(str) && !"en".equals(str)){
                if("n".equals(str) || "nr".equals(str)){
                    termList2.add(term.getName());
                }
            });
            //将两个字符串中的中文字符以及出现的总数封装到，AlgorithmMap中
            termList1.forEach(term ->{
                int[] fq = AlgorithMap.get(term);
                if(fq != null && fq.length == 2){
                    fq[0]++;//已有该字词，加1
                }
                else{
                    fq = new int[2];
                    fq[0] = 1;
                    fq[1] = 0;
                    AlgorithMap.put(term, fq);//新增字符入map
                }
            });
            termList2.forEach(term ->{
                int[] fq = AlgorithMap.get(term);
                if(fq != null && fq.length == 2){
                    fq[1]++;//已有该字词，加1
                }
                else{
                    fq = new int[2];
                    fq[0] = 0;
                    fq[1] = 1;
                    AlgorithMap.put(term, fq);//新增字符入map
                }
            });

            Iterator<String> iterator = AlgorithMap.keySet().iterator();
            double sqdoc1 = 0;
            double sqdoc2 = 0;
            double denominator = 0;
            while(iterator.hasNext()){
                int[] c = AlgorithMap.get(iterator.next());
                denominator += c[0]*c[1];
                sqdoc1 += c[0]*c[0];
                sqdoc2 += c[1]*c[1];
            }
            return denominator / Math.sqrt(sqdoc1*sqdoc2);//余弦计算
        } else {
            throw new NullPointerException(" the Document is null or have not cahrs!!");
        }
    }

    public static boolean isHanZi(char ch) {
        // 判断是否汉字
        return (ch >= 0x4E00 && ch <= 0x9FA5);
        /*if (ch >= 0x4E00 && ch <= 0x9FA5) {//汉字
            return true;
        }else{
            String str = "" + ch;
            boolean isNum = str.matches("[0-9]+");
            return isNum;
        }*/
        /*if(Character.isLetterOrDigit(ch)){
            String str = "" + ch;
            if (str.matches("[0-9a-zA-Z\\u4e00-\\u9fa5]+")){//非乱码
                return true;
            }else return false;
        }else return false;*/
    }

    /**
     * 根据输入的Unicode字符，获取它的GB2312编码或者ascii编码，
     *
     * @param ch 输入的GB2312中文字符或者ASCII字符(128个)
     * @return ch在GB2312中的位置，-1表示该字符不认识
     */
    public static short getGB2312Id(char ch) {
        try {
            byte[] buffer = Character.toString(ch).getBytes("GB2312");
            if (buffer.length != 2) {
                // 正常情况下buffer应该是两个字节，否则说明ch不属于GB2312编码，故返回'?'，此时说明不认识该字符
                return -1;
            }
            int b0 = (int) (buffer[0] & 0x0FF) - 161; // 编码从A1开始，因此减去0xA1=161
            int b1 = (int) (buffer[1] & 0x0FF) - 161;
            return (short) (b0 * 94 + b1);// 第一个字符和最后一个字符没有汉字，因此每个区只收16*6-2=94个汉字
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static void main(String[] args) {
        String str1="《2016新款梵高油画鸢尾花真丝丝巾高档外贸女士长款春夏百搭艺术围巾";
        String str2="《2016高档梵高油画真丝丝巾女士长款秋冬百搭防晒蚕丝披肩围巾两用";
        String str3="狂澜交响曲,山水,周韶华";
        long start=System.currentTimeMillis();
        double Similarity=Cosine.getSimilarity(str1, str2);
        System.out.println("用时:"+(System.currentTimeMillis()-start));
        System.out.println(Similarity);
    }
}
