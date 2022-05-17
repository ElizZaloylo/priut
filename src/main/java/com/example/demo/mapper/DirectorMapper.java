package com.example.demo.mapper;

import com.example.demo.dto.DirectorDTO;
import com.example.demo.dto.PriutDTO;
import com.example.demo.entity.DirectorEntity;

public class DirectorMapper {
    public static DirectorDTO mapEntityToDTO (DirectorEntity directorEntity) {
        DirectorDTO directorDTO = new DirectorDTO();
        directorDTO.setName(directorEntity.getName());
        return directorDTO;
    }

    public static DirectorEntity mapDTOtoEntity (DirectorDTO directorDTO) {
        DirectorEntity directorEntity = new DirectorEntity();
        directorEntity.setName(directorDTO.getName());
        return directorEntity;
    }
}

