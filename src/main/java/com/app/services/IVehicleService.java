package com.app.services;

import java.util.List;

import com.app.entities.Vehicle;

public interface IVehicleService {

	public List<Vehicle> getAll();

	public Vehicle addVehicle(Vehicle vehicle);

	public Vehicle updateVehicle(Vehicle vehicle);

	public void deleteVehicle(Long id);
}
