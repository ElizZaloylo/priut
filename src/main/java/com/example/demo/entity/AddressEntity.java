package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class AddressEntity {
    @Id
    @GeneratedValue
    private int id;
    private String street;

    @OneToOne(cascade = CascadeType.ALL)
    private UserEntity userEntity;



    public AddressEntity() {
    }

    public AddressEntity(int id, String street, UserEntity userEntity) {
        this.id = id;
        this.street = street;
        this.userEntity = userEntity;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public AddressEntity(int id, String street) {
        this.id = id;
        this.street = street;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
