package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.exception.StudentNotFound;
import com.example.demo.service.HomeService;

@RestController
public class HomeController {

	@Autowired
	private HomeService homeService;
	
	@GetMapping(value = "/login")
	public ResponseEntity<Student> getLoginData(@RequestParam String uname,@RequestParam String pass) throws StudentNotFound{
		System.out.println("Login Data :  " + uname + " " + pass);
		Student student = null;
	
		student = homeService.getLoginData(uname, pass);
		System.out.println(student.getName());
		
		return ResponseEntity.ok(student);
	}
	
}
