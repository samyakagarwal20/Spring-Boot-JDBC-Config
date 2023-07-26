package com.yflash.SampleJDBC.service;

import com.yflash.SampleJDBC.entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> getAllUserDetails();
}
