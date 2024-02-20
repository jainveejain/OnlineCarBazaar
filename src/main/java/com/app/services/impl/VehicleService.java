package com.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Vehicle;
import com.app.repositories.VehicleRepositories;
import com.app.services.IVehicleService;

@Service
public class VehicleService implements IVehicleService {

	@Autowired
	private VehicleRepositories vehicleRepo;

	@Override
	public List<Vehicle> getAll() {
		return vehicleRepo.findAll();
	}

	@Override
	public Vehicle addVehicle(Vehicle vehicle) {
		return vehicleRepo.save(vehicle);
	}

	@Override
	public Vehicle updateVehicle(Vehicle vehicle) {
		return vehicleRepo.save(vehicle);
	}

	@Override
	public void deleteVehicle(Long id) {
		vehicleRepo.deleteById(id);
	}

}
