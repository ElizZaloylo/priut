package com.example.demo.mapper;

import com.example.demo.dto.AddressDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.entity.AddressEntity;
import com.example.demo.entity.UserEntity;

public class UserMapper {
    public static UserDTO mapEntityToDTO(UserEntity userEntity) {
        UserDTO userDTO = new UserDTO();
        AddressDTO addressDTO = AddressMapper.mapEntityToDTO(userEntity.getAddressEntity());
        userDTO.setAddressDTO(addressDTO);
        userDTO.setName(userEntity.getName());
        userDTO.setAge(userEntity.getAge());
        userDTO.setNumber(userEntity.getNumber());
        return userDTO;
    }

    public static UserEntity mapDTOtoEntity(UserDTO userDTO) {
        UserEntity userEntity = new UserEntity();
        AddressEntity addressEntity = AddressMapper.mapDTOtoEntity(userDTO.getAddressDTO());
        userEntity.setAddressEntity(addressEntity);
        userEntity.setName(userDTO.getName());
        userEntity.setAge(userDTO.getAge());
        userEntity.setNumber(userDTO.getNumber());
        return userEntity;
    }
}
