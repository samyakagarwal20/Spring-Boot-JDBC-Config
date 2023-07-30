package com.yflash.SampleJDBC;

import com.yflash.SampleJDBC.entity.UserEntity;
import com.yflash.SampleJDBC.service.UserService;
import com.yflash.SampleJDBC.service.impl.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class SampleJdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SampleJdbcApplication.class, args);
		UserService userService = context.getBean(UserServiceImpl.class);
		List<UserEntity> userEntityList = userService.getAllUserDetails();
		System.out.println(userEntityList);
	}

}
