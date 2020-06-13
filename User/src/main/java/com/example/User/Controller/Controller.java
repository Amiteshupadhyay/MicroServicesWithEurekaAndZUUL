package com.example.User.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.User.DTO.UserDTO;
import com.example.User.Service.IUserService;
import com.example.User.VO.UserDetails;


@RestController
@RequestMapping("/user")
public class Controller {

	@Autowired
	private Environment environment;

	@Autowired
	IUserService userService;

	@GetMapping("/status/check")
	public String status() {
		return "Working at " + environment.getProperty("local.server.port");
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserDTO createUser(@RequestBody UserDetails userDetails) {
		
		UserDTO userDTO = new UserDTO();
		userDTO.setEmail(userDetails.getEmail());
		userDTO.setFirstName(userDetails.getFirstName());
		userDTO.setLastName(userDetails.getLastName());
		userDTO.setPassword(userDetails.getPassword());
		
		userService.createUser(userDTO);
		return userDTO;
	}
}
