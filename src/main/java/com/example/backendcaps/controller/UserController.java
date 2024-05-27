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

    @GetMapping("/{UserId}")
    public Optional<User> getUserById(@PathVariable("UserId") Long userId){
        return userService.getUser(userId);
    }


    @DeleteMapping("/{UserId}")
    public void deleteUser(@PathVariable("UserId") Long UserId){
        userService.deleteUser(UserId);
    }

    @PostMapping
    public void saveUpdateUser(@RequestBody User user){
        userService.saveOrUpdateUser(user);
    }
}
