package com.example.test.services;

import com.example.test.entities.UserEntity;
import com.example.test.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> find(){
        return userRepository.findAll();
    }

}
