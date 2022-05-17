package com.example.demo.mapper;

import com.example.demo.dto.CatDTO;
import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entity.CatEntity;
import com.example.demo.entity.EmployeeEntity;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMapper {

    public static EmployeeDTO mapEntityToDTO (EmployeeEntity employeeEntity){
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setName(employeeEntity.getName());
        employeeDTO.setPost(employeeEntity.getPost());
        return employeeDTO;
    }

    public static List<EmployeeDTO> mapListEntityToListDTO (List<EmployeeEntity> employeeList) {
        List<EmployeeDTO> employies = new ArrayList<>();
        employeeList.forEach(employeeEntity -> {
            EmployeeDTO employeeDTO = mapEntityToDTO(employeeEntity);
            employies.add(employeeDTO);

        });
        return employies;
    }

    public static EmployeeEntity mapDTOtoEntity (EmployeeDTO employeeDTO){
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setName(employeeDTO.getName());
        employeeEntity.setPost(employeeDTO.getPost());
        return employeeEntity;
    }

    public static List<EmployeeEntity> mapListDTOtoEntity (List<EmployeeDTO> employeeDTOS){
        List<EmployeeEntity> employs = new ArrayList<>();
        employeeDTOS.forEach(employeeDTO -> {
            EmployeeEntity employeeEntity = mapDTOtoEntity(employeeDTO);
            employs.add(employeeEntity);
        });
            return employs;
    }
}
