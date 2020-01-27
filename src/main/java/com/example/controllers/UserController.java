package com.example.controllers;

import com.example.services.UserService;
import com.example.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index() {
        return "Hello world";
    }

    @RequestMapping("/add-user")
    public String newApp() {
        String name = userService.addUser();
        return "Hello " + name ;
    }
}
