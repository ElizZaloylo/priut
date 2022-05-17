package com.example.demo.repository;

import com.example.demo.entity.DirectorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends JpaRepository<DirectorEntity, Integer> {

}
