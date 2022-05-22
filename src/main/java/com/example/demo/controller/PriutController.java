package com.example.demo.controller;

import com.example.demo.dto.PriutDTO;
import com.example.demo.service.PriutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/priut")
public class PriutController {

    @Autowired
    private PriutService priutService;

    @GetMapping("/{id}")
    private PriutDTO getPriut(@PathVariable("id") Integer id) {
        return priutService.getPriut(id);
    }

    @GetMapping("/{id}/animals/count")
    private Integer getAnimalsCount(@PathVariable(value = "id") Integer id) {
        return priutService.getAnimalsCount(id);
    }

    @GetMapping("/{id}/cats/count")
    private Integer getCatsCount(@PathVariable(value = "id") Integer id) {
        return priutService.getCatsCount(id);
    }

    @GetMapping("/{id}/dogs/count")
    private Integer getDogsCount(@PathVariable(value = "id") Integer id) {
        return priutService.getDogsCount(id);
    }

    @GetMapping("/{id}/birds/count")
    private Integer getBirdsCount(@PathVariable(value = "id") Integer id) {
        return priutService.getBirdsCount(id);
    }

    @GetMapping("/{id}/priut")
    private String getNamePriut(@PathVariable("id") Integer id) {
        return priutService.getNamePriut(id);
    }

    @PostMapping
    public void addPriut(@RequestBody PriutDTO priutDTO) {
        priutService.addPriut(priutDTO);
    }

    @DeleteMapping("/{id}")
    public void deletePriut(@PathVariable("id") Integer id) {
        priutService.deletePriut(id);
    }


}
