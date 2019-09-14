package com.ywb.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @title:
 * @package
 * @description:
 * @author: Yuan
 * @date:
 * @version: V1.0
 */
public class RandomCard {
    Random random = new Random();
    SimpleDateFormat sdf = new SimpleDateFormat();
    public String getName() {
        String[] f_name = {"袁", "赵", "秦", "燕", "张", "殷", "李", "吴", "杜", "郭", "舒", "孟",
        "宋", "何", "苏", "孔", "吕", "白", "姬", "唐", "元", "彭", "西门", "严", "齐", "韩", "陆",
        "鲁", "潘", "武", "谭", "胡", "宫", "龚", "车", "杨", "祝", "朱", "诸葛", "祁", "雷", "贺",
        "刘", "马", "卫", "魏", "任", "窦", "费", "石", "汤", "史", "师", "邓"};
        String[] l_name = {"明", "忠", "贵", "振华", "王义", "荣", "金生", "林", "富", "有福",
                "淑兰", "淑珍", "秀英", "淑琴", "秀兰", "淑敏", "秀珍", "桂", "素", "云",
                "建国", "建华", "明", "强", "春生", "国庆", "跃进", "援朝", "卫国", "建设",
                "秀英", "淑英", "淑兰", "淑敏", "秀兰", "淑华", "秀荣", "超英", "军", "强",
                "伟", "文革", "向东", "卫彪", "卫东", "建国", "红", "静", "秀英", "丽", "莉",
                "伟", "勇", "涛", "强", "磊", "颖", "静", "芳", "莉", "红梅", "磊", "超", "洋",
                "伟", "鹏", "硕", "帅", "畅", "宇", "娜", "佳", "静", "颖", "莹", "蕊", "畅", "萌",
                "雪", "爽", "硕", "子豪", "宇轩", "浩然", "帅", "响", "想", "子涵", "晨"};
        String name = f_name[random.nextInt(f_name.length)] + l_name[random.nextInt(l_name.length)];
        return name;
    }
     public long getQQ() {
        long QQ;
        QQ = 100000000 + (long) (random.nextDouble() * 800000000);
        return QQ;
    }
    public String getJob() {
        String job;
        String joblist[] = {"前端", "JAVA", "PM", "运维", "IOS", "Android", "UI"};
        job = joblist[random.nextInt(joblist.length)];
        return job;
    }
    public String getSchool() {
        String school;
        String schoollist[] = { "河北大学", "山西大学", "辽宁大学", "吉林大学",
                "黑龙江大学", "江苏大学", "浙江大学", "安徽大学",
                "福建大学", "江西大学", "山东大学", "河南大学",
                "湖北大学", "湖南大学", "广东大学", "海南大学",
                "四川大学", "贵州大学", "云南大学", "陕西大学",
                "甘肃大学", "青海大学", "台湾大学", "西藏大学",
                "内蒙古大学", "新疆大学", "甘肃大学", "香港大学"};
        school = schoollist[random.nextInt(schoollist.length)];
        return school;
    }
    public int getNumber_online() {
        int number_online = random.nextInt(9999) + 1;
        return number_online;
    }
    public String getDaily_link() {
        String daily_link = "http://www.jnshu.com/school/" + (random.nextInt(99999) + 1) + "/daily";
        return daily_link;
    }
    public String getOath() {
        String oath;
        String oathlist[] = {"我要坚持学习下去，如果不能坚持，选择放弃，就让我打球天天被帽！", "好好学习，努力学习",
        "我要在一个月内完成任务,否则就不吃糖果", "我要一个月内完成全部任务，否则吃一个月泡面。", "学到最后，加油",
        "确定已经下定决心开始踏上修真之路了"};
        oath = oathlist[random.nextInt(oathlist.length)];
        return oath;
    }
    public String getBrother() {
        String brother = this.getName();
        return brother;
    }
    public String getWhere_know() {
        String where_know;
        String where_knowlist[] = {"微信公众号", "朋友推荐", "知乎", "其他"};
        where_know = where_knowlist[random.nextInt(where_knowlist.length)];
        return where_know;
    }
    public long getDate() {
        long date = (new Date().getTime()) + (random.nextInt(7) * 86400000);
        return date;
    }
    public long getCreate_at() {
        long create_at = new Date().getTime();
        return create_at;
    }
    public long getUpdate_at() {
        long update_at = new Date().getTime();
        return update_at;
    }
}
