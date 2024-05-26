package com.example.backendcaps.controller;

import com.example.backendcaps.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.backendcaps.entity.User;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAll(){
        return userService.getUsers();
    }

    @GetMapping("/{UserId}")
    public Optional<User> getById(@PathVariable("UserId") Long UserId){
        return userService.getUser(UserId);
    }


    @DeleteMapping("/{UserId}")
    public void delete(@PathVariable("UserId") Long UserId){
        userService.delete(UserId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody User user){
        userService.saveOrUpdate(user);
    }
}
