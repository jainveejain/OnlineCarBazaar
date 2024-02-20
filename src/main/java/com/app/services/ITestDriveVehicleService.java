package com.app.services;

import java.util.List;

import com.app.entities.TestDriveVehicle;
public interface ITestDriveVehicleService {

	public List<TestDriveVehicle> getAll();
	
	public TestDriveVehicle add(TestDriveVehicle t);
	
	public TestDriveVehicle update(TestDriveVehicle t);
	
	public void delete(Long id);
}
