package com.example.demo.controller;

import com.example.demo.dto.DirectorDTO;
import com.example.demo.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/director")
public class DirectorController {
    @Autowired
    private DirectorService directorService;

    @GetMapping("/{id}")
    public ResponseEntity<Object> getDirector(@PathVariable("id") Integer id) {
            return ResponseEntity.ok(directorService.getDirector(id));
    }

    @PostMapping
    public void addDirector(@RequestBody DirectorDTO directorDTO) {
        directorService.addDirector(directorDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteDirector(@PathVariable("id") Integer id) {
        directorService.deleteDirector(id);
    }

}
