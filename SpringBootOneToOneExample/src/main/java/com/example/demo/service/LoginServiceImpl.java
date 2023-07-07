package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Login;
import com.example.demo.repo.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginRepository loginRepository;
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Override
	public void addLoginData(Login login) {
		// TODO Auto-generated method stub
		System.out.println("In Repo : "  +  login);
		Login login1 = loginRepository.save(login);
		System.out.println("Check Mail Send Start-------->");
		if(login1 != null) {
			SimpleMailMessage message = new SimpleMailMessage();
			//message.setFrom("ajasshaikh8390@gmail.com");
			message.setTo(login.getUser().getEmail(),"pritamsonawane09@gmail.com","sushantskshirsagar@gmail.com");
			message.setSubject("Testing- java mail Send Code.");
			message.setText("Hello," + login.getUser().getName() +", Thanks for registeration");
			
			javaMailSender.send(message);
			System.out.println("mail Send End----->");
		}else {
			System.out.println("Data Not Save DB...!");
		}
	}

}
