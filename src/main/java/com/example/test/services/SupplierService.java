package com.example.test.services;

import com.example.test.entities.SupplierEntity;
import com.example.test.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;

    public List<SupplierEntity> find(){
        return supplierRepository.findAll();
    }

}
