package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.UserEntity;
import com.example.demo.mapper.UserMapper;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDTO getUser(Integer id) {
        UserEntity userEntity = userRepository.findById(id).get();
        return UserMapper.mapEntityToDTO(userEntity);

    }

    @Transactional
    public void addUser(UserDTO userDTO) {
        userRepository.save(UserMapper.mapDTOtoEntity(userDTO));
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
