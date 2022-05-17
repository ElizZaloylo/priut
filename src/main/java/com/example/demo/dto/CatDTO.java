package com.example.demo.dto;

public class CatDTO {
    private String name;
    private String color;
    private int age;
    private int price;

    public CatDTO(String name, String color, int age, int price) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.price = price;
    }

    public CatDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
