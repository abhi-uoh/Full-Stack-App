package com.user.userbackend.controller;


import com.user.userbackend.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.user.userbackend.model.Users;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3002")
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;
    @GetMapping("/userslist")
    public List<Users> listOfUsers(){

        return userRepository.findAll();
    }

}
