package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class EmployeeEntity {

    private String post;
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @ManyToOne
    private PriutEntity priutEntity;

    public EmployeeEntity() {
    }

    public EmployeeEntity(String post, String name, int id) {
        this.post = post;
        this.name = name;
        this.id = id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
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

    public PriutEntity getPriutEntity() {
        return priutEntity;
    }

    public void setPriutEntity(PriutEntity priutEntity) {
        this.priutEntity = priutEntity;
    }
}
