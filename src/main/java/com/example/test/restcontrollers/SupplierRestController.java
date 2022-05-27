package com.example.test.restcontrollers;

import com.example.test.entities.SupplierEntity;
import com.example.test.services.SupplierService;
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
@RequestMapping("/suppliers")
public class SupplierRestController {
    @Autowired
    private SupplierService supplierService;

    @GetMapping()
    public List<SupplierEntity> find() {
        return supplierService.find();
    }
}
