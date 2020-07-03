package com.example.demo.dao;


import com.example.demo.entity.Login;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface LoginDAO {

    @Insert(value = "INSERT INTO Login VALUE(#{login.uid},#{login.passwd},#{login.identity}")
    int insert(Login login);

    @Select(value = "SELECT * FROM Login")
    List<Login>  getAllLogin();


    @Select(value = "SELECT COUNT(uid) FROM(SELECT uid FROM Login WHERE Login.uid = #{uid} ) as a " )
    int findLogin(int uid);

    @Select(value = "SELECT COUNT(uid) FROM (SELECT uid FROM Login WHERE Login.uid = #{uid} AND Login.passwd = #{passwd} AND Login.identity = #{identity}) as b")
    int checkPasswd(int uid, String passwd, int identity);
}
