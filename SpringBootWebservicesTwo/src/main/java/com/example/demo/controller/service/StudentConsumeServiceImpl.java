package com.example.demo.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Student;

@Service
public class StudentConsumeServiceImpl implements StudentConsumeService{

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Student getConsumedData(int id) {
		// TODO Auto-generated method stub
		   
		ResponseEntity<Student> responseEntity = restTemplate.getForEntity("http://localhost:9000/getStu/"+id,Student.class);
		Student student = restTemplate.getForObject("http://localhost:9000/getStu/"+id,Student.class);
		System.out.println("==========================" +student);
		return responseEntity.getBody();
	}

	
	
}
