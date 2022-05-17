package com.example.demo.controller;

import com.example.demo.dto.CatDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<Object> getUser(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(userService.getUser(id));
    }

    @PostMapping
    public void addUser(@RequestBody UserDTO userDTO) {
        userService.addUser(userDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        userService.deleteUser(id);
    }


}
