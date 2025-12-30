package org.bloggerManagementSystem.blogger.controller;

import org.bloggerManagementSystem.blogger.entity.User;
import org.bloggerManagementSystem.blogger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping("/user")
    public List<User> createUsers(@RequestBody List<User> users){
        return userService.createUsers(users);
    }
}
