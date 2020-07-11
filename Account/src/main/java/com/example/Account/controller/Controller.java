package com.example.Account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class Controller {
	@GetMapping("/status/check")
	public String status() {
		return "Working..";
	}
	@PostMapping
	public String createAccount() {
		return "Working..";
	}

}
