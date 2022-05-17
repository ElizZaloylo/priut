package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public class DogEntity extends AnimalEntity {







    public DogEntity(String name, int age, String color, int id) {
        super(name, age, color, id);
    }

    public DogEntity() {
        super();

    }

    public DogEntity(String archi, int i, String white) {

    }
}
