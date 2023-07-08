package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.service.ProductImageService;

@RestController
public class ProductImageController {
	
	@Autowired
	private ProductImageService productImageService; 

	@PostMapping(value = "/uploadfile")
	public ResponseEntity<String> saveFileData(@RequestParam("file") MultipartFile file) {
		System.out.println("File Name : " + file.getOriginalFilename());
		productImageService.saveProductImage(file);
		return ResponseEntity.ok("File Stored in DB..!");
	}
}
