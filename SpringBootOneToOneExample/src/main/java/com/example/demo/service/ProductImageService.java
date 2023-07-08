package com.example.demo.service;

import org.springframework.web.multipart.MultipartFile;

public interface ProductImageService {

	void saveProductImage(MultipartFile file);
}
