package com.example.test.restcontrollers;

import com.example.test.entities.CostumerEntity;
import com.example.test.services.CostumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Ejemplo de RestController
 * Se agrega el servicio CostumerService :)
 */
@RestController
@RequestMapping("/costumers")
public class CostumerRestController {

    @Autowired
    private CostumerService costumerService;

    @GetMapping()
    public List<CostumerEntity> find() {
        return costumerService.find();
    }
}
