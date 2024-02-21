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

import com.app.entities.Cart;
import com.app.services.ICartService;

@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = "*")
public class CartController {

	@Autowired
	private ICartService cartService;
	
	@GetMapping
	private List<Cart> getAll(){
		return cartService.getAll();
	}
	
	@PostMapping
	private Cart addCart(@RequestBody Cart cart){
		return cartService.add(cart);
	}
	
	@PutMapping
	private Cart modifyCart(@RequestBody Cart cart){
		return cartService.add(cart);
	}
	
	@DeleteMapping
	private void modifyCart(@RequestParam Long id){
		cartService.delete(id);
	}
}
