package com.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Order;
import com.app.repositories.OrderRepository;
import com.app.services.IOrderService;

@Service
public class OrderService implements IOrderService{

	@Autowired
	private OrderRepository orderRepo;
	
	@Override
	public List<Order> getAll() {
		return orderRepo.findAll();
	}

	@Override
	public Order add(Order o) {
		return orderRepo.save(o);
	}

	@Override
	public Order update(Order o) {
		return orderRepo.save(o);
	}

	@Override
	public void delete(Long id) {
		orderRepo.deleteById(id);
	}

}
