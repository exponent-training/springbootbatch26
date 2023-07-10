package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void saveUSerData(User user) {
		// TODO Auto-generated method stub
		System.out.println("In Service impl : " + user);
		userRepository.save(user);
	}

}
