package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class CatEntity extends AnimalEntity {
    public CatEntity(String name, int age, String color, int id, int price) {
        super(name, age, color, id, price);
    }
}
