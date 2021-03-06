package com.example.demo.entity;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class DogEntity extends AnimalEntity {

    public DogEntity(String name, int age, String color) {
        super(name, age, color);
    }
}
