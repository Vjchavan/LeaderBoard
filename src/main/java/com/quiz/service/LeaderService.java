package com.quiz.service;

import com.quiz.model.Users;
import com.quiz.repo.LeaderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaderService {

    @Autowired
    private LeaderRepo leaderRepo;

    public List<Users> getAllUsers(){
        return leaderRepo.findAll();
    }

    public Users createUser(Users users) {
        leaderRepo.save(users);
        return users;
    }
}
