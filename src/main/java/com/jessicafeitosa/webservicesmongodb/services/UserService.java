package com.jessicafeitosa.webservicesmongodb.services;

import com.jessicafeitosa.webservicesmongodb.domain.User;
import com.jessicafeitosa.webservicesmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
    return repo.findAll();
    }
}
