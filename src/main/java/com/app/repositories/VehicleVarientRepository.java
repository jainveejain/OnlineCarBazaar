package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.VehicleVariant;

@Repository
public interface VehicleVarientRepository extends JpaRepository<VehicleVariant, Long> {

}
