package com.example.gcpproject.controller;

import com.example.gcpproject.message.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/user")

public class UserController {



    private HashMap<String,User> userDetails = new HashMap<>();

    @GetMapping
    public Object getUserByName(){
        return userDetails;
    }

    @PostMapping(
            consumes = "application/json",
            produces = "application/json"
    )

    public User createUser(@RequestBody User user){

        userDetails.put(user.getName(),user);
        return user;

    }

}
