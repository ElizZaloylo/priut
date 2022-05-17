package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AddressDTO {

    private String street;

    @JsonIgnore
    private UserDTO userDTO;

    public AddressDTO(String street, UserDTO userDTO) {
        this.street = street;
        this.userDTO = userDTO;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public AddressDTO() {
    }
}
