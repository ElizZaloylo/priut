package com.example.demo.controller;

import com.example.demo.dto.PriutDTO;
import com.example.demo.entity.BirdEntity;
import com.example.demo.entity.CatEntity;
import com.example.demo.entity.DogEntity;
import com.example.demo.entity.PriutEntity;
import com.example.demo.repository.PriutRepository;
import com.example.demo.service.PriutService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
public class PriutServiceTest {

    @InjectMocks
    private PriutService mockPriutService;

    @Mock
    private PriutRepository mockPriutRepository;

    @Test
    public void getPriutTest() {
        PriutEntity priutEntity = createPriutEntity();
        PriutDTO expectedResult = createPriutDTO();
        Mockito.when(mockPriutRepository.findById(27)).thenReturn(Optional.of(priutEntity));
        PriutDTO actualResult = mockPriutService.getPriut(27);
        Assertions.assertEquals(createPriutEntity().getName(), createPriutDTO().getName());

    }

    private PriutEntity createPriutEntity() {
        PriutEntity priutEntity = new PriutEntity();
        priutEntity.setName("Priut");
        return priutEntity;
    }

    private PriutDTO createPriutDTO() {
        PriutDTO priutDTO = new PriutDTO();
        priutDTO.setName("Priut");
        return priutDTO;
    }

    @Test
    public void getAnimalCountTest() {
        PriutEntity priutEntity = new PriutEntity();
        List<CatEntity> catEntityList = new ArrayList<>();
        CatEntity catEntity = new CatEntity("Lion", 5, "Black", 8, 25);
        catEntityList.add(catEntity);
        priutEntity.setCatList(catEntityList);
        List<BirdEntity> birdEntityList = new ArrayList<>();
        BirdEntity birdEntity = new BirdEntity("Chiki", 4, "White", 6, 64);
        birdEntityList.add(birdEntity);
        priutEntity.setBirdList(birdEntityList);
        List<DogEntity> dogEntityList = new ArrayList<>();
        DogEntity dogEntity = new DogEntity("Chaha", 5, "Orange");
        dogEntityList.add(dogEntity);
        priutEntity.setDogList(dogEntityList);
        Integer expectedResult = 3;
        Mockito.when(mockPriutRepository.findById(3)).thenReturn(Optional.of(priutEntity));
        Integer actualResult = mockPriutService.getAnimalsCount(3);
        Assertions.assertEquals(expectedResult, actualResult);
        Mockito.verify(mockPriutRepository, Mockito.times(1)).findById(3);
    }

    @Test
    public void getNamePriutTest() {
        PriutEntity priutEntity = createPriutEntity();
        String expectedResult = "Priut";
        Mockito.when(mockPriutRepository.findById(3)).thenReturn(Optional.of(priutEntity));
        String actualResult = mockPriutService.getNamePriut(3);
        Assertions.assertEquals(expectedResult, actualResult);
        Mockito.verify(mockPriutRepository, Mockito.times(1)).findById(3);
    }

    @Test
    public void getCatsCountTest() {
        PriutEntity priutEntity = new PriutEntity();
        List<CatEntity>  catEntityList = new ArrayList<>();
        CatEntity catEntity = new CatEntity("Chak", 10, "Black", 4,300);
        CatEntity catEntity1 = new CatEntity("Kok", 5, "Green", 8, 54);
        catEntityList.add(catEntity);
        catEntityList.add(catEntity1);
        priutEntity.setCatList(catEntityList);
        Integer expectedResult = 2;
        Mockito.when(mockPriutRepository.findById(20)).thenReturn(Optional.of(priutEntity));
        Integer actualResult = mockPriutService.getCatsCount(20);
        Assertions.assertEquals(expectedResult, actualResult);
        Mockito.verify(mockPriutRepository, Mockito.times(1)).findById(20);
    }

    @Test
    public void getDogsCountTest() {
        PriutEntity priutEntity = new PriutEntity();
        List<DogEntity> dogEntityList = new ArrayList<>();
        DogEntity dogEntity = new DogEntity("Chok", 5, "pink");
        DogEntity dogEntity1 = new DogEntity("Gay", 5, "red");
        dogEntityList.add(dogEntity);
        dogEntityList.add(dogEntity1);
        priutEntity.setDogList(dogEntityList);
        Integer expectedResult = 2;
        Mockito.when(mockPriutRepository.findById(30)).thenReturn(Optional.of(priutEntity));
        Integer actualResult = mockPriutService.getDogsCount(30);
        Assertions.assertEquals(expectedResult, actualResult);
        Mockito.verify(mockPriutRepository, Mockito.times(1)).findById(30);
    }

    @Test
    public void getBirdsCountTest() {
        PriutEntity priutEntity = new PriutEntity();
        List<BirdEntity> birdEntityList = new ArrayList<>();
        BirdEntity birdEntity = new BirdEntity("Lilo", 5, "blue", 8, 96);
        BirdEntity birdEntity1 = new BirdEntity("Lila", 6, "black", 7, 25);
        birdEntityList.add(birdEntity);
        birdEntityList.add(birdEntity1);
        priutEntity.setBirdList(birdEntityList);
        Integer expectedResult = 2;
        Mockito.when(mockPriutRepository.findById(40)).thenReturn(Optional.of(priutEntity));
        Integer actualResult = mockPriutService.getBirdsCount(40);
        Assertions.assertEquals(expectedResult, actualResult);
        Mockito.verify(mockPriutRepository, Mockito.times(1)).findById(40);
    }

    @Test
    public void addPriutTest() {
        PriutDTO priutDTO = new PriutDTO();
        mockPriutService.addPriut(priutDTO);
        Mockito.verify(mockPriutRepository, Mockito.times(1)).save(Mockito.any(PriutEntity.class));
    }

    @Test
    public void deletePriutTest() {
        mockPriutService.deletePriut(3);
        Mockito.verify(mockPriutRepository, Mockito.times(1)).deleteById(3);
    }





}
