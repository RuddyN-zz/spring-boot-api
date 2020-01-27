package com.example.controllers;

import com.example.services.UserSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserSrv userSrv;

    @RequestMapping("/")
    public String index() {
        return "Hello world";
    }

    @RequestMapping("/app")
    public String newApp() {
        userSrv.addUser();
        return "Hello umuzi";
    }
}
