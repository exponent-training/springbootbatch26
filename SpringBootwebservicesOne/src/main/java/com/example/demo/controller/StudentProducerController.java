package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentProducerService;

@RestController
public class StudentProducerController {

	
	@Autowired
	private StudentProducerService studentProducerService;
	
	@GetMapping(value = "/getStu/{id}")
	public ResponseEntity<Student>  getStudentData(@PathVariable int id){
		Student student = studentProducerService.getStudentData(id);
		if(student != null) {
			return new ResponseEntity(student,HttpStatus.OK);
		}
		return new ResponseEntity("Not Found",HttpStatus.FOUND);
	}
	
}
