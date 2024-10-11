package com.quiz.repo;

import com.quiz.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaderRepo extends MongoRepository<Users,String> {
}
