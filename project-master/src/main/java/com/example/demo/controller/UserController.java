package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @description 
* @author Tim Lin
* @create 2018-07-01 
**/
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/stu/getAllUser",method = RequestMethod.GET)
    public String getAllUser(HttpServletRequest request){
        List<User> list = userService.getAllUser();
        request.setAttribute("user",list);
        return "user";
    }

    @RequestMapping(value = "/stu/insert",method = RequestMethod.GET)
    public String insert(@ModelAttribute("user") User user,Model model){
        userService.insert(user);
        return "redirect:/stu/getAllUser";
    }


    @RequestMapping(value = "/stu/update",method = RequestMethod.GET)
    public String update(Model model){
        List<User> list = userService.getAllUser();
//        request.setAttribute("students",list);
        return "user";
    }

    @RequestMapping(value = "/stu/index",method = RequestMethod.GET)
    public String indexUsr(Model model){
        model.addAttribute("user",new User());
        return "insert";
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Model model){
        return "index";
    }



}
