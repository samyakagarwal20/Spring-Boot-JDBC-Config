package com.yflash.SampleJDBC.service.impl;

import com.yflash.SampleJDBC.entity.UserEntity;
import com.yflash.SampleJDBC.repository.UserRepository;
import com.yflash.SampleJDBC.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LogManager.getLogger(UserServiceImpl.class);

    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserEntity> getAllUserDetails() {
        return userRepository.findAll();
    }

}
