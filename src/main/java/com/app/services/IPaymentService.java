package com.app.services;

import java.util.List;

import com.app.entities.Payment;

public interface IPaymentService {

	public List<Payment> getAll();
	
	public Payment add(Payment p);
	
	public Payment update(Payment p);
	
	public void delete(Long id);
}
