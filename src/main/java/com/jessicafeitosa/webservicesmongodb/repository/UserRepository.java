package com.jessicafeitosa.webservicesmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.jessicafeitosa.webservicesmongodb.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
