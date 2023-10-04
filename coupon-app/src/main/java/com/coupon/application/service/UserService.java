package com.coupon.application.service;

import com.coupon.application.model.User;
import com.coupon.application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public String saveUser;
    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user) {
        System.out.println(user);
        userRepository.save(user);

    }

    public void saveMultipleUser(List<User> users) {
        for (User user : users) {
            System.out.println(user);
            userRepository.save(user);
        }

    }
}