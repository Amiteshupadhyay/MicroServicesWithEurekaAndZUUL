package com.example.User.Service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.User.DTO.UserDTO;

public interface IUserService extends UserDetailsService {
	UserDTO createUser(UserDTO userDTO );
	UserDTO getUserDetailsByEmail(String email);

}
