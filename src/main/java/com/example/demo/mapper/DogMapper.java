package com.example.demo.mapper;

import com.example.demo.dto.DogDTO;
import com.example.demo.entity.DogEntity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DogMapper {
    public static DogDTO mapEntityToDTO(DogEntity dogEntity) {
        DogDTO dogDTO = new DogDTO();
        dogDTO.setAge(dogEntity.getAge());
        dogDTO.setName(dogEntity.getName());
        dogDTO.setPrice(dogEntity.getPrice());
        dogDTO.setColor(dogEntity.getColor());
        return dogDTO;


    }
    public static List<DogDTO> mapListEntityToDTO(List<DogEntity> dogList) {
        List<DogDTO> dogs = new ArrayList<>();
        dogList.forEach(dogEntity -> {
            DogDTO dogDTO = mapEntityToDTO(dogEntity);
            dogs.add(dogDTO);
        });
        return dogs;
    }
    public static DogEntity mapDTOtoEntity(DogDTO dogDTO) {
        DogEntity dogEntity = new DogEntity();
        dogEntity.setAge(dogDTO.getAge());
        dogEntity.setColor(dogDTO.getColor());
        dogEntity.setPrice(dogDTO.getPrice());
        dogEntity.setName(dogDTO.getName());
        return dogEntity;
    }
    public static List<DogEntity> mapListDTOtoListEntity(List<DogDTO> dogList){
        List<DogEntity> dogs = new ArrayList<>();
        if (dogList != null) {
            dogList.forEach(dogDTO -> {
                DogEntity dogEntity = mapDTOtoEntity(dogDTO);
                dogs.add(dogEntity);
            });
        } else {
            return new ArrayList<>();
        }
        return dogs;
    }


}
