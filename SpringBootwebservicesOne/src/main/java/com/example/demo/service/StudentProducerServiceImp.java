package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;

@Service
public class StudentProducerServiceImp implements StudentProducerService{

	@Override
	public Student getStudentData(int id) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setId(1);student.setName("Abcd");
		student.setAddress("Pune");student.setUname("admin");
		student.setPass("admin");
		if(id == student.getId()) {
			return student;
		}
		return null;
	}

}
