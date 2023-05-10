package com.example.gcpproject.controller;

import com.example.gcpproject.message.entity.User;
import com.example.gcpproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/user")

public class UserController {


    @Autowired
    private UserService userService;


    @GetMapping(
            value = "/test"
    )
    public Object test(){
        return "Testing";
    }

    @GetMapping
    public Object getUserByName(){
        return userService.getUserDetails();
    }

    @PostMapping(
            consumes = "application/json",
            produces = "application/json"
    )

    public User createUser(@RequestBody User user){

       return userService.createUser(user);

    }

}
