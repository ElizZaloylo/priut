package com.example.demo.service;

import com.example.demo.dto.DirectorDTO;
import com.example.demo.entity.DirectorEntity;
import com.example.demo.mapper.DirectorMapper;
import com.example.demo.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class DirectorService {

    @Autowired
    private DirectorRepository directorRepository;

    public DirectorDTO getDirector(Integer id){
        DirectorEntity directorEntity = directorRepository.getById(id);
        return DirectorMapper.mapEntityToDTO(directorEntity);
    }

    @Transactional
    public void addDirector (DirectorDTO directorDTO){
        directorRepository.save(DirectorMapper.mapDTOtoEntity(directorDTO));

    }

    public void deleteDirector(Integer id){
        directorRepository.deleteById(id);
    }

}
