package com.example.backendcaps.controller;

import com.example.backendcaps.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.backendcaps.entity.User;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUser(){
        return userService.getUsers();
    }

    @GetMapping("/{userId}")
    public Optional<User> getUserById(@PathVariable("userId") Long userId){
        return userService.getUser(userId);
    }


    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId){
        userService.deleteUser(userId);
    }

    @PostMapping
    public void saveUpdateUser(@RequestBody User user){
        userService.saveOrUpdateUser(user);
    }
}
