package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ProductImage;

@Repository
public interface ProductImageRepository extends JpaRepository<ProductImage, Integer>{

}
