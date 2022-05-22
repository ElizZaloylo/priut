package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PriutDTO {

    private String name;

    private List<DogDTO> listDog;
    private List<CatDTO> listCat;
    private List<BirdDTO> listBird;

    private List<EmployeeDTO> listEmployee;

    private DirectorDTO directorDTO;



}
