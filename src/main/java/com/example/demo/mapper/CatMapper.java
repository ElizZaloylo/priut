package com.example.demo.mapper;

import com.example.demo.dto.CatDTO;
import com.example.demo.dto.DogDTO;
import com.example.demo.entity.CatEntity;
import com.example.demo.entity.DogEntity;

import java.util.ArrayList;
import java.util.List;

public class CatMapper {
    public static CatDTO mapEntityToDTO(CatEntity catEntity) {
        CatDTO catDTO = new CatDTO();
        catDTO.setPrice(catEntity.getPrice());
        catDTO.setName(catEntity.getName());
        catDTO.setColor(catEntity.getColor());
        catDTO.setAge(catEntity.getAge());
        return catDTO;
    }
    public static List<CatDTO> mapListEntityToListDTO (List<CatEntity> catList) {
        List<CatDTO> cats = new ArrayList<>();
        catList.forEach(catEntity -> {
            CatDTO catDTO = mapEntityToDTO(catEntity);
            cats.add(catDTO);

        });
        return cats;
    }

    public static CatEntity mapDTOtoEntity(CatDTO catDTO) {
        CatEntity catEntity = new CatEntity();
        catEntity.setAge(catDTO.getAge());
        catEntity.setColor(catDTO.getColor());
        catEntity.setPrice(catDTO.getPrice());
        catEntity.setName(catDTO.getName());
        return catEntity;
    }

    public static List<CatEntity> mapListDTOtoListEntity(List<CatDTO> catDTOList){
        List<CatEntity> cats = new ArrayList<>();
        catDTOList.forEach(dogDTO -> {
            CatEntity catEntity = mapDTOtoEntity(dogDTO);
            cats.add(catEntity);
        });
        return cats;
    }

}
