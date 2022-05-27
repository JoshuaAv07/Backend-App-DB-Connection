package com.example.test.restcontrollers;

import com.example.test.entities.ProductEntity;
import com.example.test.entities.UserEntity;
import com.example.test.services.ProductService;
import com.example.test.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Ejemplo de RestController
 * Se agrega el servicio ProductService :)
 */
@RestController
@RequestMapping("/products")
public class ProductRestController {

    @Autowired
    private ProductService productService;

    @GetMapping()
    public List<ProductEntity> find() {
        return productService.find();
    }
}
