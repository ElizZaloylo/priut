package com.example.demo.service;

import com.example.demo.dto.BirdDTO;
import com.example.demo.dto.CatDTO;
import com.example.demo.entity.BirdEntity;
import com.example.demo.entity.CatEntity;
import com.example.demo.repository.BirdRepository;
import com.example.demo.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {

    @Autowired
    private BirdRepository birdRepository;

    @Autowired
    private CatRepository catRepository;

    public BirdDTO getBird(Integer id) {
        BirdEntity birdEntity = birdRepository.findById(id).get();
        BirdDTO birdDTO = new BirdDTO();
        birdDTO.setAge(birdEntity.getAge());
        birdDTO.setColor(birdEntity.getColor());
        birdDTO.setName(birdEntity.getName());
        birdDTO.setPrice(birdEntity.getPrice());
        return birdDTO;
    }

    public CatDTO getCat(Integer id) {
        CatEntity  catEntity = catRepository.findById(id).get();
        CatDTO catDTO = new CatDTO();
        catDTO.setAge(catEntity.getAge());
        catDTO.setColor(catEntity.getColor());
        catDTO.setName(catEntity.getName());
        catDTO.setPrice(catEntity.getPrice());
        return catDTO;
    }
    public void  addCat(CatDTO catDTO) {
        CatEntity catEntity = new CatEntity();
        catEntity.setAge(catDTO.getAge());
        catEntity.setPrice(catDTO.getPrice());
        catEntity.setName(catDTO.getName());
        catEntity.setColor(catDTO.getColor());
        catRepository.save(catEntity);


    }

    public void deleteCat(Integer id) {
        catRepository.deleteById(id);
    }
    public void deleteBird(Integer id) {
        birdRepository.deleteById(id);
    }


}
