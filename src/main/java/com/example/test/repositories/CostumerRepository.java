package com.example.test.repositories;

import com.example.test.entities.CostumerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CostumerRepository extends JpaRepository<CostumerEntity, Integer> {
}
