package com.example.User.Service;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.User.DTO.UserDTO;
import com.example.User.Data.UserEntity;
import com.example.User.Data.UserRepo;

@Service
public class UserService implements IUserService {
	UserRepo userRepo;
	@Autowired
	public UserService(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	@Override
	public UserDTO createUser(UserDTO userDTO) {
		UserEntity userEntity = new UserEntity();
		userEntity.setEmail(userDTO.getEmail());
		userEntity.setFirstName(userDTO.getFirstName());
		userEntity.setLastName(userDTO.getLastName());
		userEntity.setEncryptedPassword("Test");
		userEntity.setUserId("Test");
		
		userRepo.save(userEntity);
		return userDTO;
	}
	/*
	@Override
	public UserDTO createUser(UserDTO userDTO) {
		userDTO.setUserId(UUID.randomUUID().toString());
		
		UserEntity userEntity = new UserEntity();
		userEntity.setEmail(userDTO.getEmail());
		userEntity.setFirstName(userDTO.getFirstName());
		userEntity.setLastName(userDTO.getLastName());
		userEntity.setEncryptedPassword("Test");
		userEntity.setUserId("Test");
		
		userRepo.save(userEntity);
		return userDTO;
	}
*/
}
