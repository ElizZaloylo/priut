package com.example.demo.mapper;

import com.example.demo.dto.AddressDTO;
import com.example.demo.entity.AddressEntity;

public class AddressMapper {
    public static AddressDTO mapEntityToDTO(AddressEntity addressEntity) {
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setStreet(addressEntity.getStreet());
        return addressDTO;
    }

    public static AddressEntity mapDTOtoEntity(AddressDTO addressDTO) {
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setStreet(addressDTO.getStreet());
        return addressEntity;
    }
}
