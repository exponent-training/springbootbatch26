package com.example.demo.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/saveUser")
    public ResponseEntity<String> saveUserInfo(@RequestBody User user) {
		System.out.println("In contrller :" + user);
		userService.saveUSerData(user);
		return ResponseEntity.ok("Data Inserted");
	}
	
	@GetMapping(value = "/user/csvexport")
	public String writeUserDataInCSVFile(HttpServletResponse response) throws IOException {
		response.setContentType("text/csv");
		DateFormat dateFormat =  new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
		String currentDate =  dateFormat.format(new Date());
		
		String headerKey = "Content-Disposition";
		String headerValue = "attachment;filename=users_" +currentDate+ ".csv";
		response.setHeader(headerKey, headerValue);
		
		List<User> list = userService.getAllData();
		
		ICsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(), CsvPreference.STANDARD_PREFERENCE);
		
		String[] csvHeader = {"USER ID","NAME","ADDRESS","USERNAME","ROLES"};
		String[] nameMapping =  {"id","name","address","uname","roles"};
		
		csvWriter.writeHeader(csvHeader);
		
		for(User u : list) {
		  csvWriter.write(u, nameMapping);	
		}
		csvWriter.close();
		return "Data write in CSV file ";
		
	}
}
