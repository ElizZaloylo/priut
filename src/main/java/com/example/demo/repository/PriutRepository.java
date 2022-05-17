package com.example.demo.repository;

import com.example.demo.entity.PriutEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface PriutRepository extends JpaRepository<PriutEntity, Integer> {

    }

