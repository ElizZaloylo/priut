package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class DirectorEntity {

    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne(cascade = CascadeType.PERSIST)
    private PriutEntity priutEntity;

    public PriutEntity getPriutEntity() {
        return priutEntity;
    }

    public void setPriutEntity(PriutEntity priutEntity) {
        this.priutEntity = priutEntity;
    }

    public DirectorEntity() {
    }

    public DirectorEntity(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
