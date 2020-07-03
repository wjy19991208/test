package com.example.demo.entity;

import lombok.Data;

/**
* @description 
* @author Tim Lin
* @create 2018-07-01 
**/
@Data
//员工实体类 （identity (0:经理; 1:系统管理员; 2:库存管理员; 3:售货员
public class User {

    private Integer uid;
    private String name;
    private int identity;
    private int salary;

    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public Integer getUid(){
        return this.uid;
    }

    public int getIdentity() {
        return this.identity;
    }
    public void setIdentity(int identity){
        this.identity=identity;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

