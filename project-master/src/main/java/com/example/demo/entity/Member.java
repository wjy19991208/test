package com.example.demo.entity;
//会员实体类
public class Member {
    private Integer mid;
    private String name;
    private long phone;
    private int score;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getName() {   return this.name;}
    public void setName(String name) { this.name=name;}

    public long getPhone() {   return this.phone;}
    public void setPhone(long phone) {   this.phone=phone;}

    public int getScore() {   return this.score;}
    public void setScore(int score) {   this.score=score;}
}
