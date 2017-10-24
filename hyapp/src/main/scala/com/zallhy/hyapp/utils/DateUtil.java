package com.zallhy.hyapp.utils;


import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 日期工具类 默认使用 "yyyy-MM-dd HH:mm:ss" 格式化日期
 */
public final class DateUtil {
    /**
     * 英文简写（默认）如：2010-12-01
     */
    public static String FORMAT_SHORT = "yyyy-MM-dd";
    /**
     * 英文全称 如：2010-12-01 23:15:06
     */
    public static String FORMAT_LONG = "yyyy-MM-dd HH:mm:ss";
    /**
     * 精确到毫秒的完整时间 如：yyyy-MM-dd HH:mm:ss.S
     */
    public static String FORMAT_FULL = "yyyy-MM-dd HH:mm:ss.S";
    /**
     * 中文简写 如：2010年12月01日
     */
    public static String FORMAT_SHORT_CN = "yyyy年MM月dd";
    /**
     * 中文全称 如：2010年12月01日 23时15分06秒
     */
    public static String FORMAT_LONG_CN = "yyyy年MM月dd日  HH时mm分ss秒";
    /**
     * 精确到毫秒的完整中文时间
     */
    public static String FORMAT_FULL_CN = "yyyy年MM月dd日  HH时mm分ss秒SSS毫秒";

    /**
     * 获得默认的 date pattern
     */
    public static String getDatePattern() {
        return FORMAT_LONG;
    }

    /**
     * 根据预设格式返回当前日期
     *
     * @return
     */
    public static String getNow() {
        return format(new Date());
    }

    /**
     * 根据用户格式返回当前日期
     *
     * @param format
     * @return
     */
    public static String getNow(String format) {
        return format(new Date(), format);
    }

    /**
     * 使用预设格式格式化日期
     *
     * @param date
     * @return
     */
    public static String format(Date date) {
        return format(date, getDatePattern());
    }

    /**
     * 使用用户格式格式化日期
     *
     * @param date    日期
     * @param pattern 日期格式
     * @return
     */
    public static String format(Date date, String pattern) {
        String returnValue = "";
        if (date != null) {
            SimpleDateFormat df = new SimpleDateFormat(pattern);
            returnValue = df.format(date);
        }
        return (returnValue);
    }

    /**
     * 使用预设格式提取字符串日期
     *
     * @param strDate 日期字符串
     * @return
     */
    public static Date parse(String strDate) {
        return parse(strDate, getDatePattern());
    }

    /**
     * 使用用户格式提取字符串日期
     *
     * @param strDate 日期字符串
     * @param pattern 日期格式
     * @return
     */
    public static Date parse(String strDate, String pattern) {
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        try {
            return df.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }


    /**
     * 获取时间戳
     */
    public static String getTimeString() {
        SimpleDateFormat df = new SimpleDateFormat(FORMAT_FULL);
        Calendar calendar = Calendar.getInstance();
        return df.format(calendar.getTime());
    }

    /**
     * 获取日期年份
     *
     * @param date 日期
     * @return
     */
    public static String getYear(Date date) {
        return format(date).substring(0, 4);
    }

    /**
     * 按默认格式的字符串距离今天的天数
     *
     * @param date 日期字符串
     * @return
     */
    public static int countDays(String date) {
        long t = Calendar.getInstance().getTime().getTime();
        Calendar c = Calendar.getInstance();
        c.setTime(parse(date));
        long t1 = c.getTime().getTime();
        return (int) (t / 1000 - t1 / 1000) / 3600 / 24;
    }

    /**
     * 传入时间和当前系统时间相差多少分钟
     *
     * @param date
     * @return
     */
    public static long countMin(String date) {
        Calendar dateOne = Calendar.getInstance(), dateTwo = Calendar.getInstance();
        dateOne.setTime(new Date());    //设置为当前系统时间
        dateTwo.setTime(parse(date));            //设置为2015年1月15日
        long timeOne = dateOne.getTimeInMillis();
        long timeTwo = dateTwo.getTimeInMillis();
        long minute = (timeOne - timeTwo) / (1000 * 60);//转化minute
        System.out.println("相隔" + minute + "分钟");
        return minute;
    }

    /**
     * 按用户格式字符串距离今天的天数
     *
     * @param date   日期字符串
     * @param format 日期格式
     * @return
     */
    public static int countDays(String date, String format) {
        long t = Calendar.getInstance().getTime().getTime();
        Calendar c = Calendar.getInstance();
        c.setTime(parse(date, format));
        long t1 = c.getTime().getTime();
        return (int) (t / 1000 - t1 / 1000) / 3600 / 24;
    }

    /**
     * 将Unix时间戳转换成日期
     *
     * @param timestamp 时间戳
     * @return String 日期字符串
     */
    public static String unixTimestampToDate(long timestamp) {
        SimpleDateFormat sd = new SimpleDateFormat(FORMAT_LONG);
        sd.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        return sd.format(new Date(timestamp));
    }

    /**
     * 将当前日期转换成Unix时间戳
     *
     * @return long 时间戳
     */
    public static long dateToUnixTimestamp() {
        long timestamp = new Date().getTime();
        return timestamp;
    }

    /**
     * 将指定的日期转换成Unix时间戳
     *
     * @param date 需要转换的日期 yyyy-MM-dd
     * @return long 时间戳
     */
    public static long dateToUnixTimestamp(String date, String dateFormat) {
        long timestamp = 0;
        try {
            timestamp = new SimpleDateFormat(dateFormat).parse(date).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return timestamp;
    }

    /**
     * 将指定的日期转换成Unix时间戳
     *
     * @param date 需要转换的日期 yyyy-MM-dd HH:mm:ss
     * @return long 时间戳
     */
    public static long dateToUnixTimestamp(String date) {
        long timestamp = 0;
        try {
            timestamp = new SimpleDateFormat(FORMAT_LONG).parse(date).getTime();
        } catch (ParseException e) {
        }
        return timestamp;
    }

    /**
     * 将指定的日期转换成Unix时间戳
     *
     * @param date 需要转换的日期 yyyy-MM-dd HH:mm:ss
     * @return long 时间戳
     */
    public static long dateToShortTimestamp(String date) {
        Long timestamp = dateToUnixTimestamp(date);
        if(timestamp!=null){
            if(timestamp.toString().length()>=10) {
                timestamp = Long.valueOf(timestamp.toString().substring(0, 10));
            }else{
                timestamp = Long.valueOf(0);
            }
        }
        return timestamp;
    }

    /**
     * 两个时间比较
     *
     * @param date1
     * @return
     */
    public static int compareDateWithNow(Date date1) {
        Date date2 = new Date();
        int rnum = date1.compareTo(date2);
        return rnum;
    }

    /**
     * 两个时间比较(时间戳比较)
     *
     * @param date1
     * @return
     */
    public static int compareDateWithNow(long date1) {
        long date2 = dateToUnixTimestamp();
        if (date1 > date2) {
            return 1;
        } else if (date1 < date2) {
            return -1;
        } else {
            return 0;
        }
    }

    /**
     * 判断日期区间如：11：00 前后2分钟
     */
    public static boolean compareTimeWithNow(String startTime) {
        boolean b = false;
        if (StringUtils.isNotBlank(startTime)) {
            long nowdate = dateToUnixTimestamp();
            String startDate = getNow(FORMAT_SHORT) + " " + startTime;
            if (parse(startDate).getTime() >= nowdate - 120000 && parse(startDate).getTime() <= nowdate + 120000) {
                b = true;
            }
        }
        return b;
    }

    /**
     * 得到两个时间的所有日期
     *
     * @param begin 开始时间
     * @param end   结束时间
     * @return
     * @throws ParseException
     */
    public static List<String> findDates(String begin, String end) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        List<String> lDate = new ArrayList<String>();
        lDate.add(begin);
        Date dBegin = sdf.parse(begin);
        Date dEnd = sdf.parse(end);
        Calendar calBegin = Calendar.getInstance();
        // 使用给定的 Date 设置此 Calendar 的时间
        calBegin.setTime(dBegin);
        Calendar calEnd = Calendar.getInstance();
        // 使用给定的 Date 设置此 Calendar 的时间
        calEnd.setTime(dEnd);
        // 测试此日期是否在指定日期之后
        while (dEnd.after(calBegin.getTime())) {
            // 根据日历的规则，为给定的日历字段添加或减去指定的时间量
            calBegin.add(Calendar.DAY_OF_MONTH, 1);
            lDate.add(sdf.format(calBegin.getTime()));
        }
        return lDate;
    }

    public static void main(String[] args) {
        System.out.println(dateToShortTimestamp(getNow()));
        System.out.println(unixTimestampToDate(Long.valueOf("1493185891000")));
    }

    private static final ThreadLocal<SimpleDateFormat> threadLocal = new ThreadLocal<SimpleDateFormat>();

    private static final Object object = new Object();

    /**
     * 获取SimpleDateFormat
     *
     * @param pattern 日期格式
     * @return SimpleDateFormat对象
     * @throws RuntimeException 异常：非法日期格式
     */
    private static SimpleDateFormat getDateFormat(String pattern) throws RuntimeException {
        SimpleDateFormat dateFormat = threadLocal.get();
        if (dateFormat == null) {
            synchronized (object) {
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(pattern);
                    dateFormat.setLenient(false);
                    threadLocal.set(dateFormat);
                }
            }
        }
        dateFormat.applyPattern(pattern);
        return dateFormat;
    }

    /**
     * 获取日期中的某数值。如获取月份
     *
     * @param date     日期
     * @param dateType 日期格式
     * @return 数值
     */
    private static int getInteger(Date date, int dateType) {
        int num = 0;
        Calendar calendar = Calendar.getInstance();
        if (date != null) {
            calendar.setTime(date);
            num = calendar.get(dateType);
        }
        return num;
    }


    public static String cnFullDate(String fullDate, String shotDate) {
        if (Pattern.compile("^\\d+日").matcher(shotDate).matches()) {
            return fullDate.replaceAll("\\d+日", shotDate);
        } else if (Pattern.compile("^\\d+月\\d+日").matcher(shotDate).matches()) {
            return fullDate.replaceAll("\\d+月\\d+日", shotDate);
        }
        return shotDate;
    }

    public static String dFullDate(String fullDate, String shotDate) {
        if (Pattern.compile("^\\d+.\\d+").matcher(shotDate).matches() && Pattern.compile("^\\d+.\\d+.\\d+").matcher(fullDate).matches()) {
            String year = fullDate.split("\\.")[0];
            return year + "." + shotDate;
        }
        return shotDate;
    }

    /**
     * 从字符串中提取格式为yyyy年mm月dd日格式的时间
     *
     * @return
     */
    public static List<String> getShortCnDateFromDateStr(String dateStr) {
        List<String> list = new ArrayList<String>();
        Pattern p = Pattern.compile("[0-9]{4}年[0-9]{1,2}月[0-9]{1,2}日");
        Matcher m = p.matcher(dateStr);
        while (m.find()) {
            String g = m.group();
            list.add(g);
        }
        return list;
    }

    /**
     * 从字符串中提取格式为yyyy年mm月dd日-mm月dd日格式的时间
     *
     * @return
     */
    public static List<String> getCnDateBetweenFromDateStr(String dateStr) {
        List<String> list = new ArrayList<String>();
        Pattern p = Pattern.compile("[0-9]{4}年[0-9]{1,2}月[0-9]{1,2}日-[0-9]{1,2}月[0-9]{1,2}日");
        Matcher m = p.matcher(dateStr);
        while (m.find()) {
            String g = m.group();

            list.add(g);
        }
        return list;
    }

    public static String sFullDate(String fullDate, String shotDate) {
        if (Pattern.compile("^\\d+/\\d+").matcher(shotDate).matches() && Pattern.compile("^\\d+/\\d+/\\d+").matcher(fullDate).matches()) {
            String year = fullDate.split("/")[0];
            return year + "/" + shotDate;
        }
        return shotDate;
    }

}
