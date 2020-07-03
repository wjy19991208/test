package com.example.demo.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
//该测试文件测试LoignService的登入账号验证
public class LoginServiceimplTest {

    @Autowired
    private LoginServiceimpl lspl ;

    @Test
    //以下测试账号在数据库中

    public void TestUidInDB(){
        assertEquals(true,lspl.checkExistUid(18080123));
    }
    @Test
    //测试密码与身份全部正确
    public void TestUidInDBPawdAndIdentity() {
        assertEquals(true, lspl.checkPasswd(18080123,"123456",0));
    }

    //测试密码错误，身份正确
    @Test
    public void TestUidInDBNoPasswdAndIdentity(){
        assertEquals(false,lspl.checkPasswd(18080123,"12346",0));
    }

    //密码正确，身份错误
    @Test
    public void TestUidInDBPasswdAndNoIentity(){
        assertEquals(false,lspl.checkPasswd(18080123,"123456",1));
    }

    //全部错误
    @Test
    public void TestUidInDBNoPasswdAndNoIdentity(){
        assertEquals(false,lspl.checkPasswd(18080123,"1234",2));
    }


    //账号不在数据库
    @Test
    public void TestUidNotInDB(){
        assertEquals(false,lspl.checkExistUid(123456));
    }


}