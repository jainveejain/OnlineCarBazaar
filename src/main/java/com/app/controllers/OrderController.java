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

import com.app.entities.Order;
import com.app.services.IOrderService;

@RestController
@RequestMapping("/order")
@CrossOrigin(origins = "*")
public class OrderController {

	@Autowired
	private IOrderService orderService;
	
	@GetMapping
	private List<Order> getAll(){
		return orderService.getAll();
	}
	
	@PostMapping
	private Order addOrder(@RequestBody Order order){
		return orderService.add(order);
	}
	
	@PutMapping
	private Order modifyOrder(@RequestBody Order order){
		return orderService.add(order);
	}
	
	@DeleteMapping
	private void modifyOrder(@RequestParam Long id){
		orderService.delete(id);
	}
}
