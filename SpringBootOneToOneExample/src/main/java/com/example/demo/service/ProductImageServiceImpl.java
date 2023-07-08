package com.example.demo.service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.ProductImage;
import com.example.demo.repo.ProductImageRepository;

@Service
public class ProductImageServiceImpl implements ProductImageService{

	@Autowired
	private ProductImageRepository productImageRepository;

	@Override
	public void saveProductImage(MultipartFile file) {
		// TODO Auto-generated method stub
		try {
			ProductImage productImage = new ProductImage();
			productImage.setFname(file.getOriginalFilename());
			productImage.setFtype(file.getContentType());
			byte[] b = compressImage(file.getBytes());
			productImage.setImgaeData(b);
			productImageRepository.save(productImage);	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static byte[] compressImage(byte[] data) {

		Deflater deflater = new Deflater();
		deflater.setLevel(Deflater.BEST_COMPRESSION);
		deflater.setInput(data);
		deflater.finish();

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
		byte[] tmp = new byte[4*1024];
		while(!deflater.finished()) {
			int size = deflater.deflate(tmp);
			outputStream.write(tmp, 0, size);
		}
		try {
			outputStream.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		return outputStream.toByteArray();
	}

	private static byte[] deCompressImage(byte[] data)  {

		Inflater inflater = new Inflater();
		inflater.setInput(data);

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
		byte[] tmp = new byte[4*1024];

		try {
			while(!inflater.finished()) {
				int size = inflater.inflate(tmp);
				outputStream.write(tmp, 0, size);
			}
			outputStream.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return outputStream.toByteArray();
	}


}
