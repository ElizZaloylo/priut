package com.example.demo.controller;

import com.example.demo.dto.DirectorDTO;
import com.example.demo.dto.EmployeeDTO;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

     @GetMapping("/{id}")
    public ResponseEntity<Object> getEmployee(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(employeeService.getEmployee(id));
    }

    @PostMapping
    public void addEmployee(@RequestBody EmployeeDTO employeeDTO) {
        employeeService.addEmployee(employeeDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id") Integer id) {
        employeeService.deleteEmployee(id);
    }


}
