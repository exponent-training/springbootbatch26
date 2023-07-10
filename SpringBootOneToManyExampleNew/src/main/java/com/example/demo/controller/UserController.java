package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/saveUser")
    public ResponseEntity<String> saveUserInfo(@RequestBody User user) {
		System.out.println("In contrller :" + user);
		userService.saveUSerData(user);
		return ResponseEntity.ok("Data Inserted");
	}
}
