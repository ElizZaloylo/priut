package com.example.demo.dto;

public class DirectorDTO {

    private String name;

    private PriutDTO priutDTO;

    public PriutDTO getPriutDTO() {
        return priutDTO;
    }

    public void setPriutDTO(PriutDTO priutDTO) {
        this.priutDTO = priutDTO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public DirectorDTO() {
    }
}
