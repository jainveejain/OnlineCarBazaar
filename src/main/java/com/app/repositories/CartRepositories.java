package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Cart;

public interface CartRepositories extends JpaRepository<Cart, Long>{

}
