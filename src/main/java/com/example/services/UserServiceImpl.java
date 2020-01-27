package com.example.services;

import com.example.dao.User;
import com.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    private User user;

    public String addUser() {
        user = new User(1, "umuzi");
        userRepository.save(user);
        String userName = userRepository.findById((long) 1).get().getName();
        System.out.println(userName);
        return userName;
    }
}
