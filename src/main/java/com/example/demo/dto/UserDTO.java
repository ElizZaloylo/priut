package com.example.demo.dto;

public class UserDTO {
    private String name;
    private int age;
    private int number;

    private AddressDTO addressDTO;

    public UserDTO(String name, int age, int number, AddressDTO addressDTO) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.addressDTO = addressDTO;
    }

    public AddressDTO getAddressDTO() {
        return addressDTO;
    }

    public void setAddressDTO(AddressDTO addressDTO) {
        this.addressDTO = addressDTO;
    }

    public UserDTO(String name, int age, int number, int id) {
        this.name = name;
        this.age = age;
        this.number = number;

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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }



    public UserDTO() {
    }
}
