package com.example.gcpproject.service;

import com.example.gcpproject.message.entity.User;
import com.example.gcpproject.message.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUserDetails(){
        return userRepository.findAll();
    }

    public User createUser(User user) {

        return userRepository.save(user);
    }
}
