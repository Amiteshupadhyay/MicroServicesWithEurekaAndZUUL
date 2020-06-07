package com.example.User.Service;

import java.util.UUID;

import com.example.User.DTO.UserDTO;

public class UserService implements IUserService {

	@Override
	public UserDTO createUser(UserDTO userDTO) {
		userDTO.setUserId(UUID.randomUUID().toString());
		return userDTO;
	}

}
