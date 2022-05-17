package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class PriutEntity {
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

    public DirectorEntity getDirectorEntity() {
        return directorEntity;
    }

    public void setDirectorEntity(DirectorEntity directorEntity) {
        this.directorEntity = directorEntity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<DogEntity> getDogList() {
        return dogList;
    }

    public void setDogList(List<DogEntity> dogList) {
        this.dogList = dogList;
    }

    public List<BirdEntity> getBirdList() {
        return birdList;
    }

    public void setBirdList(List<BirdEntity> birdList) {
        this.birdList = birdList;
    }

    public List<CatEntity> getCatList() {
        return catList;
    }

    public void setCatList(List<CatEntity> catList) {
        this.catList = catList;
    }

    public PriutEntity(int id, List<DogEntity> dogList, List<BirdEntity> birdList, List<CatEntity> catList) {
        this.id = id;
        this.dogList = dogList;
        this.birdList = birdList;
        this.catList = catList;
    }

    public PriutEntity() {
    }

    public List<EmployeeEntity> getEmployeeEntities() {
        return employeeEntities;
    }

    public void setEmployeeEntities(List<EmployeeEntity> employeeEntities) {
        this.employeeEntities = employeeEntities;
    }
}


