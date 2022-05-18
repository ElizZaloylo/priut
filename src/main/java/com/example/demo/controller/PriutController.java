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
    private Integer getAnimalsCount(@PathVariable(value="id") Integer id){
        return priutService.getAnimalsCount(id);
    }
    @GetMapping("/{id}/priut")
    private String getNamePriut(@PathVariable("id")Integer id){
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
