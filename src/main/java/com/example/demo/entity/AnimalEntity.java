package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@MappedSuperclass
public class AnimalEntity {
    private String name;
    private int age;
    private String color;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private int id;
    private int price;

    public AnimalEntity(String name, int age, String color, int id) {

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public AnimalEntity(String name, int age, String color, int id, int price) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.id = id;
        this.price = price;
    }



    public AnimalEntity() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
