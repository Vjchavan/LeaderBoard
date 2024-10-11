package com.quiz.controllers;

import com.quiz.model.Users;
import com.quiz.service.LeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leaderboard")
public class MainController {

    @Autowired
    private LeaderService leaderService;

    @PostMapping("/createUser")
    public ResponseEntity<Users> createUser(@RequestBody Users user){
        return new ResponseEntity<>(leaderService.createUser(user),HttpStatus.OK);
    }

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<Users>> getAllUsers(){
        return new ResponseEntity<>(leaderService.getAllUsers(),HttpStatus.OK);
    }
}
