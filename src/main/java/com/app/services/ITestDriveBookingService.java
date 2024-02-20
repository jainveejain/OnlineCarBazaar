package com.app.services;

import java.util.List;

import com.app.entities.TestDriveBooking;

public interface ITestDriveBookingService {

	public List<TestDriveBooking> getAll();
	
	public TestDriveBooking add(TestDriveBooking t);
	
	public TestDriveBooking update(TestDriveBooking t);
	
	public void delete(Long id);
}
