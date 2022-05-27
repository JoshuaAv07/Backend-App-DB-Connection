package com.example.test.services;

import com.example.test.entities.ProductEntity;
import com.example.test.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductEntity> find(){
        return productRepository.findAll();
    }
}

