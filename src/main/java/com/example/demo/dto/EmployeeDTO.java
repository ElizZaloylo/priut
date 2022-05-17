package com.example.demo.dto;

public class EmployeeDTO {

    private String post;
    private String name;

    private PriutDTO priutDTO;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String post, String name) {
        this.post = post;
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PriutDTO getPriutDTO() {
        return priutDTO;
    }

    public void setPriutDTO(PriutDTO priutDTO) {
        this.priutDTO = priutDTO;
    }
}
