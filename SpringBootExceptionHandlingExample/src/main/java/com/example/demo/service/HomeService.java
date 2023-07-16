package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.exception.StudentNotFound;

public interface HomeService {

	Student getLoginData(String uname,String pass) throws StudentNotFound;
}
