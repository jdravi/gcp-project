package com.example.gcpproject.controller;

import com.example.gcpproject.message.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
//
public class TestController {


    @GetMapping
    public User getTestData(){

        User user = new User();
        user.setName("Ravi Prakash:cloudTest");
        user.setAge(30);
        user.setAddress("Ballia");
        return user;
    }

}
