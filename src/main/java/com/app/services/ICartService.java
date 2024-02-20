package com.app.services;

import java.util.List;

import com.app.entities.Cart;

public interface ICartService {

	public List<Cart> getAll();
	
	public Cart add(Cart c);
	
	public Cart update(Cart c);
	
	public void delete(Long id);
}
