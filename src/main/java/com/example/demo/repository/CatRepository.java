package com.example.demo.repository;

import com.example.demo.entity.CatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CatRepository extends JpaRepository<CatEntity, Integer> {

    static List<Object> findBy(Integer id) {
        return null;
    }

}
