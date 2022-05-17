package com.example.demo.repository;

import com.example.demo.entity.BirdEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BirdRepository extends JpaRepository<BirdEntity, Integer> {
}
