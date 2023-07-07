package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Login;
import com.example.demo.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@PostMapping(value = "/userinfo")
	public ResponseEntity<String> saveUserInfo(@RequestBody Login login){
		System.out.println("Login Data : " + login);
		loginService.addLoginData(login);
		return ResponseEntity.ok("User Successfully Saved...!");
	}
}
