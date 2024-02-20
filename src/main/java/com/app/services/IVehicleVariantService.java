package com.app.services;

import java.util.List;

import com.app.entities.VehicleVariant;

public interface IVehicleVariantService {

	public List<VehicleVariant> getAll();
	
	public VehicleVariant add(VehicleVariant v);
	
	public VehicleVariant update(VehicleVariant v);
	
	public void delete(Long id);
}
