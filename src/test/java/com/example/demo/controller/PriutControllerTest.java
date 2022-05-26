package com.example.demo.controller;

import com.example.demo.dto.PriutDTO;
import com.example.demo.entity.PriutEntity;
import com.example.demo.service.PriutService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PriutControllerTest {

    @Mock
    private PriutService mockPriutService;

    @InjectMocks
    private PriutController mockPriutController;

    @Test
    public void getAnimalsCountTest() {
        Integer expectedResult = 1;
        Mockito.when(mockPriutService.getAnimalsCount(24)).thenReturn(expectedResult);
        Integer actualResult = mockPriutController.getAnimalsCount(24);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getCatsCountTest() {
        Integer expectedResult = 2;
        Mockito.when(mockPriutService.getCatsCount(26)).thenReturn(expectedResult);
        Integer actualResult = mockPriutController.getCatsCount(26);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getBirdsTest() {
        Integer expectedResult = 3;
        Mockito.when(mockPriutService.getBirdsCount(5)).thenReturn(expectedResult);
        Integer actualResult = mockPriutController.getBirdsCount(5);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getDogsTest() {
        Integer expectedResult = 4;
        Mockito.when(mockPriutService.getDogsCount(6)).thenReturn(expectedResult);
        Integer actualResult = mockPriutController.getDogsCount(6);
        Assertions.assertEquals(expectedResult, actualResult);
        }

    @Test
    public void getPriutTest() {
        PriutDTO expectedResult = createPriutDTO();
        Mockito.when(mockPriutService.getPriut(27)).thenReturn(expectedResult);
        PriutDTO actualResult = mockPriutController.getPriut(27);
        Assertions.assertEquals(expectedResult, actualResult);
        }
        private PriutDTO createPriutDTO() {
        PriutDTO priutDTO = new PriutDTO();
        priutDTO.setName("Priut");
        return priutDTO;
        }

    }




