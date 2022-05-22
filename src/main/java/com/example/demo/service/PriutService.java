package com.example.demo.service;


import com.example.demo.dto.PriutDTO;
import com.example.demo.entity.PriutEntity;
import com.example.demo.mapper.*;
import com.example.demo.repository.PriutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;


@Service
public class PriutService {

    @Autowired
    private PriutRepository priutRepository;

    public PriutDTO getPriut(Integer id) {
        PriutEntity priutEntity =  priutRepository.findById(id).get();
        PriutDTO priutDTO = new PriutDTO();
        priutDTO.setName(priutEntity.getName());
        priutDTO.setListBird(BirdMapper.mapListEntityToListDTO(priutEntity.getBirdList()));
        priutDTO.setListCat(CatMapper.mapListEntityToListDTO(priutEntity.getCatList()));
        priutDTO.setListDog(DogMapper.mapListEntityToDTO(priutEntity.getDogList()));
        priutDTO.setDirectorDTO(DirectorMapper.mapEntityToDTO(priutEntity.getDirectorEntity()));
        priutDTO.setListEmployee(EmployeeMapper.mapListEntityToListDTO(priutEntity.getEmployeeEntities()));
        return priutDTO;

    }

    public Integer getAnimalsCount(Integer id) {
        PriutEntity priutEntity = priutRepository.findById(id).get();
        Integer birdCount = priutEntity.getBirdList().size();
        Integer catCount = priutEntity.getCatList().size();
        Integer dogCount = priutEntity.getDogList().size();
        return dogCount + catCount + birdCount;

    }
    public String getNamePriut(Integer id) {
        PriutEntity priutEntity = priutRepository.findById(id).get();
        String namePriut = priutEntity.getName();
        return namePriut;

    }

    public Integer getCatsCount(Integer id) {
        PriutEntity priutEntity = priutRepository.findById(id).get();
        Integer catCount = priutEntity.getCatList().size();
        return catCount;
    }

    public Integer getDogsCount(Integer id) {
        PriutEntity priutEntity = priutRepository.findById(id).get();
        Integer dogsCount = priutEntity.getDogList().size();
        return dogsCount;
    }

    public Integer getBirdsCount(Integer id) {
        return priutRepository.findById(id).get().getBirdList().size();
    }

    @Transactional
    public void addPriut(PriutDTO priutDTO) {
        PriutEntity priutEntity = new PriutEntity();
        priutEntity.setName(priutDTO.getName());
        priutEntity.setBirdList(BirdMapper.mapListDTOtoEntity(priutDTO.getListBird()));
        priutEntity.setCatList(CatMapper.mapListDTOtoListEntity(priutDTO.getListCat()));
        priutEntity.setDogList(DogMapper.mapListDTOtoListEntity(priutDTO.getListDog()));
        priutEntity.setDirectorEntity(DirectorMapper.mapDTOtoEntity(priutDTO.getDirectorDTO()));
        priutEntity.setEmployeeEntities(EmployeeMapper.mapListDTOtoEntity(priutDTO.getListEmployee()));
        priutRepository.save(priutEntity);
    }
    public void deletePriut(Integer id) {priutRepository.deleteById(id);}

}
