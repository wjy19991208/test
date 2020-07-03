package com.example.demo.service.impl;

import com.example.demo.dao.UserDAO;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @description 
* @author GAO JIAN
* @create 2020-6-30
**/

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> getAllUser() {
        return userDAO.getAllUser();
    }



    @Override
    public boolean insert(User user) {
        if (null == user){
            return false;
        }
        else
        {System.out.println("请输入信息");
        // do something...
        userDAO.insert(user);}
        return true;
    }

    @Override
    public boolean update(Integer id, Integer salary) {
        if ( null == id || null  == salary){
            return false;
        }
        else
        {System.out.println("请输入信息");
        // do something...
        userDAO.updateSalary(id,salary);}
        return true;
    }
}
