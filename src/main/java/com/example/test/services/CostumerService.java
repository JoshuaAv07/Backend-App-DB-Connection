package com.example.test.services;

import com.example.test.entities.CostumerEntity;
import com.example.test.repositories.CostumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostumerService {

    @Autowired
    private CostumerRepository costumerRepository;

    public List<CostumerEntity> find(){
        return costumerRepository.findAll();
    }
}
