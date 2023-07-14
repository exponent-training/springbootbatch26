package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.service.StudentConsumeService;
import com.example.demo.entity.Student;

@RestController
public class StudentConsumerContrioller {
	
	@Autowired
	private StudentConsumeService studentConsumeService;

	@RequestMapping(value = "/consumeStu/{id}")
	public ResponseEntity<Student> consumeStudentData(@PathVariable int id){
		Student student = studentConsumeService.getConsumedData(id);
		return ResponseEntity.ok(student);
	}
}
