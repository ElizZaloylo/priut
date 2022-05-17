package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class CatEntity extends AnimalEntity {

    public CatEntity(String name, int age, String color, int id) {
        super(name, age, color, id);
    }

    public CatEntity() {
    }
}
