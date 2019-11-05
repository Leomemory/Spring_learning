package com.imooc.entity;

import java.util.Date;

public class Selection {
    private int cid;
    private int sid;
    private Date selTime;
    private int score;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public Date getSelTime() {
        return selTime;
    }

    public void setSelTime(Date selTime) {
        this.selTime = selTime;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
