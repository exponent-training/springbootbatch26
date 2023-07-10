package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.RoleData;

@Repository
public interface RolesRepository extends JpaRepository<RoleData, Integer>{

}
