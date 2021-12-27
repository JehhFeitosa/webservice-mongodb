package com.jessicafeitosa.webservicesmongodb.services;

import com.jessicafeitosa.webservicesmongodb.domain.User;
import com.jessicafeitosa.webservicesmongodb.dto.UserDTO;
import com.jessicafeitosa.webservicesmongodb.repository.UserRepository;
import com.jessicafeitosa.webservicesmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("object not found"));
    }

    public User insert(User obj){
        return repo.insert(obj);
    }

    public User fromDTO(UserDTO objDto){
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}