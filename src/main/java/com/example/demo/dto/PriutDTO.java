package com.example.demo.dto;

import java.util.List;

public class PriutDTO {

    private List<DogDTO> listDog;
    private List<CatDTO> listCat;
    private List<BirdDTO> listBird;

    private List<EmployeeDTO> listEmployee;

    private DirectorDTO directorDTO;

    public DirectorDTO getDirectorDTO() {
        return directorDTO;
    }

    public void setDirectorDTO(DirectorDTO directorDTO) {
        this.directorDTO = directorDTO;
    }

    public List<DogDTO> getListDog() {
        return listDog;
    }

    public void setListDog(List<DogDTO> listDog) {
        this.listDog = listDog;
    }

    public List<CatDTO> getListCat() {
        return listCat;
    }

    public void setListCat(List<CatDTO> listCat) {
        this.listCat = listCat;
    }

    public List<BirdDTO> getListBird() {
        return listBird;
    }

    public void setListBird(List<BirdDTO> listBird) {
        this.listBird = listBird;
    }

    public PriutDTO( List<DogDTO> listDog, List<CatDTO> listCat, List<BirdDTO> listBird) {
        this.listDog = listDog;
        this.listCat = listCat;
        this.listBird = listBird;
    }

    public PriutDTO() {
    }

    public List<EmployeeDTO> getListEmployee() {
        return listEmployee;
    }

    public void setListEmployee(List<EmployeeDTO> listEmployee) {
        this.listEmployee = listEmployee;
    }
}
