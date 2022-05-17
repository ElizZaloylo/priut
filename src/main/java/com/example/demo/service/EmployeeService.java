package com.example.demo.service;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entity.EmployeeEntity;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeDTO getEmployee(Integer id){
        EmployeeEntity employeeEntity = employeeRepository.getById(id);
        return EmployeeMapper.mapEntityToDTO(employeeEntity);
    }
    @Transactional
    public void addEmployee(EmployeeDTO employeeDTO){
        employeeRepository.save(EmployeeMapper.mapDTOtoEntity(employeeDTO));
    }

    public void deleteEmployee(Integer id){
        employeeRepository.deleteById(id);
    }
}
