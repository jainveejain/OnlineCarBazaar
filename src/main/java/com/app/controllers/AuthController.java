package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.User;
import com.app.pojo.LoginRequest;
import com.app.pojo.LoginResponse;
import com.app.services.impl.UserService;

@RestController
@CrossOrigin(origins = "*")
public class AuthController {

	@Autowired
	private UserService uService;
	
	@PostMapping("/auth")
	private LoginResponse auth(@RequestBody LoginRequest payload) {
		System.out.println(payload.getEmail());
		User user = uService.getUserByEmail(payload.getEmail());
		
		if(user != null) {
			if(payload.getPassword().equals(user.getPassword())){
				LoginResponse res = new LoginResponse();
				res.setMessage("success");
				res.setToken("sadasdsadasdad");
				res.setUser(user);
				return res;
			}
		}
		
		System.out.println("No user found with this email so failed login");
		LoginResponse res = new LoginResponse();
		res.setMessage("Login Failed");
		return res;
	}
}
