package com.app.services;

import java.util.List;

import com.app.entities.User;

public interface IUserService {

	public List<User> getAll();
	
	public User addUser(User user);
	
	public User updateUser(User user);
	
	public void deleteUser(Long id);
}
