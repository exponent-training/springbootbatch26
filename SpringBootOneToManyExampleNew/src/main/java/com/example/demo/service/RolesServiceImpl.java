package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.RoleData;
import com.example.demo.repo.RolesRepository;

@Service
public class RolesServiceImpl implements RolesService{

	@Autowired
	private RolesRepository roleRepository;
	
	@Override
	public List<RoleData> getRoleDatas() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

}
