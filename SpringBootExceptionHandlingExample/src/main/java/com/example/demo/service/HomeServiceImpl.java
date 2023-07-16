package com.example.demo.service;


import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.exception.StudentNotFound;

@Service
public class HomeServiceImpl implements HomeService{

	@Override
	public Student getLoginData(String uname, String pass) throws StudentNotFound {
		// TODO Auto-generated method stub
		if("admin".equals(uname) && "admin".equals(pass)) {
			Student student = new Student();
			student.setId(1);
			student.setName("Anonymous");
			student.setAddress("Pune");
			student.setUname("admin");
			student.setPass("admin");
			return student;
		}
		else {
			throw new StudentNotFound("Student Not Found.");
		}
		
	}

}
