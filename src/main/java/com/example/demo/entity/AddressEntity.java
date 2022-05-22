package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
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
    public AddressEntity(int id, String street) {
        this.id = id;
        this.street = street;
    }
}
