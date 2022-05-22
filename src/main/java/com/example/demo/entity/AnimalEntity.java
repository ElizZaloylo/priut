package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@MappedSuperclass
@NoArgsConstructor
@Setter
@Getter
public class AnimalEntity {

    private String name;

    private int age;

    private String color;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private int id;

    private int price;

    public AnimalEntity(String name, int age, String color, int id, int price) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.id = id;
        this.price = price;
    }
}