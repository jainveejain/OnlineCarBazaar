package com.app.services;

import java.util.List;

import com.app.entities.Order;

public interface IOrderService {

	public List<Order> getAll();
	
	public Order add(Order o);
	
	public Order update(Order o);
	
	public void delete(Long id);
}
