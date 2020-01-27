package com.example.services;

import com.example.dao.User;
import com.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSrv {

    @Autowired
    private UserRepository userRepository;

    private User user;

    public void addUser() {
//        user = new User(1, "umuzi");
//        userRepo.save(user);
        String userName = userRepository.findAll().get(0).getName();
        System.out.println(userName);
    }
}
