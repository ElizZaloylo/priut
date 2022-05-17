package com.example.demo.mapper;

import com.example.demo.dto.BirdDTO;
import com.example.demo.entity.BirdEntity;

import java.util.ArrayList;
import java.util.List;

public class BirdMapper {
    public static BirdDTO mapEntityToDTO(BirdEntity birdEntity) {
        BirdDTO birdDTO = new BirdDTO();
        birdDTO.setPrice(birdEntity.getPrice());
        birdDTO.setName(birdEntity.getName());
        birdDTO.setColor(birdEntity.getColor());
        birdDTO.setAge(birdEntity.getAge());
        return birdDTO;

    }

    public static List<BirdDTO> mapListEntityToListDTO(List<BirdEntity> birdList) {
        List<BirdDTO> birds = new ArrayList<>();
        birdList.forEach(birdEntity -> {
            BirdDTO birdDTO = mapEntityToDTO(birdEntity);
            birds.add(birdDTO);
        });
        return birds;
    }
     public static BirdEntity mapDTOtoEntity(BirdDTO birdDTO) {
        BirdEntity birdEntity = new BirdEntity();
        birdEntity.setAge(birdDTO.getAge());
        birdEntity.setColor(birdDTO.getColor());
        birdEntity.setName(birdDTO.getName());
        birdEntity.setPrice(birdDTO.getPrice());
        return birdEntity;
     }

     public static List<BirdEntity> mapListDTOtoEntity(List<BirdDTO> birdList) {
        List<BirdEntity> birds = new ArrayList<>();
        if (birdList != null){
            birdList.forEach((birdDTO -> {
                BirdEntity birdEntity = mapDTOtoEntity(birdDTO);
                birds.add(birdEntity);
            }));
        } else {
            return new ArrayList<>();
        }

        return birds;
     }
}
