package com.company.controller;

import com.company.dto.SaveUser;
import com.company.entity.User;
import com.company.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping
    public User saveUser(@RequestBody SaveUser user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable Integer id) {
        return userService.findById(id);
    }
}
