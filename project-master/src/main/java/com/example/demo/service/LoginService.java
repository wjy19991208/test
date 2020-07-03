package com.example.demo.service;


import com.example.demo.entity.Login;

import java.util.List;
public interface LoginService {
     List<Login> getAllLogin();

     boolean checkExistUid(int uid);

     boolean checkPasswd(int uid, String passwd, int identity);

}
