package com.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.TestDriveVehicle;
import com.app.repositories.TestDriveVehicleRepository;
import com.app.services.ITestDriveVehicleService;

@Service
public class TestDriveVehichleService implements ITestDriveVehicleService{

	@Autowired
	private TestDriveVehicleRepository tdvRepo;
	
	@Override
	public List<TestDriveVehicle> getAll() {
		return tdvRepo.findAll();
	}

	@Override
	public TestDriveVehicle add(TestDriveVehicle t) {
		return tdvRepo.save(t);
	}

	@Override
	public TestDriveVehicle update(TestDriveVehicle t) {
		return tdvRepo.save(t);
	}

	@Override
	public void delete(Long id) {
		tdvRepo.deleteById(id);
	}

}
