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

import com.app.entities.Payment;
import com.app.services.IPaymentService;

@RestController
@RequestMapping("/payment")
@CrossOrigin(origins = "*")
public class PaymentController {

	@Autowired
	private IPaymentService paymentService;
	
	@GetMapping
	private List<Payment> getAll(){
		return paymentService.getAll();
	}
	
	@PostMapping
	private Payment addPayment(@RequestBody Payment payment){
		return paymentService.add(payment);
	}
	
	@PutMapping
	private Payment modifyPayment(@RequestBody Payment payment){
		return paymentService.add(payment);
	}
	
	@DeleteMapping
	private void modifyPayment(@RequestParam Long id){
		paymentService.delete(id);
	}
}
