package com.pete.solution.controller;

import com.pete.solution.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserManagementController {

    @GetMapping
    public ResponseEntity<List<User>> fetchAllUsers() {
        List<User> users = new ArrayList<>();
        User user = new User("Ashutosh", "Shenoy P", "ashutosh.pete@outlook.com");
        users.add(user);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
