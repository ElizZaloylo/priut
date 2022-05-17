package com.example.demo.dto;

public class BirdDTO {
    private String name;
    private String color;
    private int price;
    private int age;

    public BirdDTO(String name, String color, int price, int age) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.age = age;

    }

    public BirdDTO() {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
