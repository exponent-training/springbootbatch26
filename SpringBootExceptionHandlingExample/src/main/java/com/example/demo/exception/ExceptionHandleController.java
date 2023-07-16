package com.example.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.Student;

@ControllerAdvice
public class ExceptionHandleController {

	@ExceptionHandler
	public @ResponseBody Student handleExceptions(StudentNotFound studentNotFound) {
		
		Student student = new Student();
		student.setErrorMsg(studentNotFound.getMessage());
		
		return student;
	}
	
}
