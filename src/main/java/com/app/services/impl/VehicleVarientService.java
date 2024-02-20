package com.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.VehicleVariant;
import com.app.repositories.VehicleVarientRepository;
import com.app.services.IVehicleVariantService;

@Service
public class VehicleVarientService implements IVehicleVariantService{

	@Autowired
	private VehicleVarientRepository vvRepo;
	
	@Override
	public List<VehicleVariant> getAll() {
		return vvRepo.findAll();
	}

	@Override
	public VehicleVariant add(VehicleVariant v) {
		return vvRepo.save(v);
	}

	@Override
	public VehicleVariant update(VehicleVariant v) {
		return vvRepo.save(v);
	}

	@Override
	public void delete(Long id) {
		vvRepo.deleteById(id);
	}

}
