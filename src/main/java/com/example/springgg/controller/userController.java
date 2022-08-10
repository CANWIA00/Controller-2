package com.example.springgg.controller;

import com.example.springgg.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class userController {

    //@RequestBody = Json seklinde gonderilmis bir objeyi bir obje olan parametreye atarken kullanilir.


    @PostMapping("/users")
    public User saveUser(@RequestBody User user){
        System.out.println("User saved!");
        return user;
    }

    @PostMapping("/users-all")
    public List<User> saveAllUser(@RequestBody List<User> users){
        System.out.println("All users saved!");
        return users;
    }

    
}
