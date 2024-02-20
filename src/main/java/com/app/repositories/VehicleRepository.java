package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Long> {

}
