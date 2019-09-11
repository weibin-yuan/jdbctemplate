package com.ywb.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private Integer id;
    private long create_at;
    private long update_at;
    private String name;
    private long QQ;
    private String job;
    private long date;
    private String school;
    private int number_online;
    private String daily_link;
    private String oath;
    private String brother;
    private String where_know;
    public User(){
    }
    public User(String name, long QQ, String job, long date, String school,
                int number_online, String daily_link, String oath, String brother,
                String where_know) {
        this.name = name;
        this.QQ = QQ;
        this.job = job;
        this.date = date;
        this.school = school;
        this.number_online = number_online;
        this.daily_link = daily_link;
        this.oath = oath;
        this.brother =brother;
        this.where_know = where_know;
    }

    /**
     * 将毫秒转换为年月日
     * @param time
     * @return
     */
    public String toFormat(long time) {
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(time);
        return sim.format(date);
    }

    /**
     * 重写
     * @return
     */
    @Override
    public String toString() {
        return "id: " + id + '\n' + "create_at: " + this.toFormat(create_at) +'\n' + "update_at: " +
                this.toFormat(update_at) + '\n' + "name: " + name + '\n' + "QQ: " + QQ + '\n' + "job: " +
                job + '\n' + "date: " + date + '\n' + "school: " + school + '\n' + "number_online: " +
                number_online + '\n' + "daily_link: " + daily_link + '\n' + "oath: " + oath + '\n' +
                "brother: " + brother + '\n' + "where_know: " + where_know + '\n';
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public long getCreate_at() {
        return create_at;
    }
    public void setCreate_at(long create_at) {
        this.create_at = create_at;
    }
    public long getUpdate_at() {
        return update_at;
    }
    public void setUpdate_at(long update_at) {
        this.update_at = update_at;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getQQ() {
        return QQ;
    }
    public void setQQ(long QQ) {
        this.QQ = QQ;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public long getDate() {
        return date;
    }
    public void setDate(long date) {
        this.date = date;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public int getNumber_online() {
        return number_online;
    }
    public void setNumber_online(int number_online) {
        this.number_online = number_online;
    }
    public String getDaily_link() {
        return daily_link;
    }
    public void setDaily_link(String daily_link) {
        this.daily_link = daily_link;
    }
    public String getOath() {
        return  oath;
    }
    public void setOath(String oath) {
        this.oath = oath;
    }
    public String getBrother() {
        return brother;
    }
    public void setBrother(String brother) {
        this.brother = brother;
    }
    public String getWhere_know() {
        return  where_know;
    }
    public void setWhere_know(String where_know) {
        this.where_know = where_know;
    }
}
