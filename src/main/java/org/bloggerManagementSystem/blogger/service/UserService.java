package org.bloggerManagementSystem.blogger.service;

import org.bloggerManagementSystem.blogger.entity.User;
import org.bloggerManagementSystem.blogger.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> createUsers(List<User> users) {
        return userRepository.saveAll(users);
    }
}
