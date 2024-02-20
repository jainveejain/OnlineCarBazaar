package com.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Payment;
import com.app.repositories.PaymentRepository;
import com.app.services.IPaymentService;

@Service
public class PaymentService implements IPaymentService{

	@Autowired
	private PaymentRepository paymentRepo;
	
	@Override
	public List<Payment> getAll() {
		return paymentRepo.findAll();
	}

	@Override
	public Payment add(Payment p) {
		return paymentRepo.save(p);
	}

	@Override
	public Payment update(Payment p) {
		return paymentRepo.save(p);
	}

	@Override
	public void delete(Long id) {
		paymentRepo.deleteById(id);
	}

}
