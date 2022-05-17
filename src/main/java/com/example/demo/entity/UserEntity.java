package com.example.demo.entity;

import org.apache.tomcat.jni.Address;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class UserEntity {
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int number;
    private int age;
    @OneToOne(cascade = CascadeType.ALL)
    private AddressEntity addressEntity;

    public AddressEntity getAddressEntity() {
        return addressEntity;
    }

    public void setAddressEntity(AddressEntity addressEntity) {
        this.addressEntity = addressEntity;
    }

    public UserEntity(String name, int id, int number, int age) {
        this.name = name;
        this.id = id;
        this.number = number;
        this.age = age;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserEntity() {
    }
}
