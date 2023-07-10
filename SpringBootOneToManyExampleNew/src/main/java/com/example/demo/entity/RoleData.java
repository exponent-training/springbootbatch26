package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RoleData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rid;
	
	private String roleName;

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "RoleData [rid=" + rid + ", roleName=" + roleName + "]";
	}
	
	
}
