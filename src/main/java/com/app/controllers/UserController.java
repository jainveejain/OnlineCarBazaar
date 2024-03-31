package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.User;
import com.app.services.IUserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	private IUserService userService;
	
	@GetMapping
	private List<User> getAll(){
		return userService.getAll();
	}
	
	@PostMapping
	private User addUser(@RequestBody User user){
		String email = user.getEmail();
		User userObj = userService.getUserByEmail(email);
		if(userObj==null) {
			return userService.addUser(user);
		}
		return userObj;    //either we can send null value
	}
	
	@PutMapping
	private User modifyUser(@RequestBody User user){
		return userService.addUser(user);
	}
	
	@DeleteMapping
	private void modifyUser(@RequestParam Long id){
		userService.deleteUser(id);
	}
}
