package com.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Cart;
import com.app.repositories.CartRepository;
import com.app.services.ICartService;

@Service
public class CartService implements ICartService {
	
	@Autowired
	private CartRepository cartRepo;

	@Override
	public List<Cart> getAll() {
		return cartRepo.findAll();
	}

	@Override
	public Cart add(Cart c) {
		return cartRepo.save(c);
	}

	@Override
	public Cart update(Cart c) {
		return cartRepo.save(c);
	}

	@Override
	public void delete(Long id) {
		cartRepo.deleteById(id);
	}

}
