package com.skyline.web.controller;


import com.skyline.entity.po.TUser;
import com.skyline.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("findAll")
    public List<TUser> findAll(){
        return userService.findAll();
    }
}
