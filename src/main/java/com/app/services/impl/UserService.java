package com.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.User;
import com.app.repositories.UserRepository;
import com.app.services.IUserService;

@Service
public class UserService implements IUserService{

	@Autowired
	private UserRepository userRepo ;
	
	@Override
	public List<User> getAll() {
		return userRepo.findAll();
	}

	@Override
	public User addUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public User updateUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public void deleteUser(Long id) {
		userRepo.deleteById(id);	
	}
	
	@Override
	public User getUserByEmail(String email) {
		return userRepo.findByEmail(email);
	}
	
	

}
