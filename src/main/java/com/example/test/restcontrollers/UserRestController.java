package com.example.test.restcontrollers;

import com.example.test.entities.UserEntity;
import com.example.test.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Ejemplo de RestController
 * Se agrega el servicio UserService :)
 */
@RestController
@RequestMapping("/users")
public class UserRestController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public List<UserEntity>find() {
        return userService.find();
    }

}