package com.example.User.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.User.VO.UserDetails;

@RestController
@RequestMapping("/user")
public class Controller {
	
	@Autowired
	private Environment environment;

	@GetMapping("/status/check")
	public String status() {
		return "Working at "+environment.getProperty("local.server.port");
	}
	
	@PostMapping
	public String createUser(@RequestBody UserDetails userDetails) {
		return "User Created";
		
	}

}
