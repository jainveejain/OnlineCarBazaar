package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Payment;

public interface PaymentRepositories extends JpaRepository<Payment,Long> {

}
