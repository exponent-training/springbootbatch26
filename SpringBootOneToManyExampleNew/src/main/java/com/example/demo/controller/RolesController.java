package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.RoleData;
import com.example.demo.service.RolesService;

@RestController
public class RolesController {

	@Autowired
	private RolesService rolesService;
	
	@GetMapping(value = "/getRoles")
	public ResponseEntity<List<RoleData>> getAllRoleData(){
		List<RoleData> roles = rolesService.getRoleDatas();
		return ResponseEntity.ok(roles);
	}
	
}
