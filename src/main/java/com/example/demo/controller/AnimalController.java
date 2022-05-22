package com.example.demo.controller;

import com.example.demo.dto.BirdDTO;
import com.example.demo.dto.CatDTO;
import com.example.demo.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/cat/{id}")
    public ResponseEntity<CatDTO> getCat(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(animalService.getCat(id));
    }

    @GetMapping("/bird/{id}")
    public ResponseEntity<BirdDTO> getBird(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(animalService.getBird(id));
    }

    @PostMapping("/cat")
    public void addCat(@RequestBody CatDTO catDTO) {
        animalService.addCat(catDTO);
    }
    @DeleteMapping("/cat/{id}")
    public void deleteCat(@PathVariable("id") Integer id) {
        animalService.deleteCat(id);
    }
    @DeleteMapping("/bird/{id}")
    public void deletebird(@PathVariable("id") Integer id) {
        animalService.deleteBird(id);
    }

}