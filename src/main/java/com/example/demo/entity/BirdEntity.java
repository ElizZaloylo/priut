package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class BirdEntity extends AnimalEntity {


    public BirdEntity(String name, int age, String color, int id, int price) {

    }

    public BirdEntity() {

    }
}

