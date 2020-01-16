package com.controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc：
 * @title：UserController
 * @author: huangwencai
 * @date: 2020-01-16 15:36
 * @version: v4.40.0
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/getUser")
    public User getUserById(int id){
       User user= userService.Sel(id);
       return user;
    }
}