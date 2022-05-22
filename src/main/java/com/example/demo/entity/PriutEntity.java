package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PriutEntity {
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<EmployeeEntity> employeeEntities;


    @OneToOne(cascade = CascadeType.ALL)
    private DirectorEntity directorEntity;

    @OneToMany(cascade = CascadeType.ALL)
    private List<DogEntity> dogList;

    @OneToMany(cascade = CascadeType.ALL)
    private List<BirdEntity> birdList;

    @OneToMany(cascade = CascadeType.ALL)
    private List<CatEntity> catList;
    }


