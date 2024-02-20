package com.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.TestDriveBooking;
import com.app.repositories.TestDriveBookingRepository;
import com.app.services.ITestDriveBookingService;

@Service
public class TestDriveBookingService implements ITestDriveBookingService {

	@Autowired
	private TestDriveBookingRepository bookingRepo;
	
	@Override
	public List<TestDriveBooking> getAll() {
		return bookingRepo.findAll();
	}

	@Override
	public TestDriveBooking add(TestDriveBooking t) {
		return bookingRepo.save(t);
	}

	@Override
	public TestDriveBooking update(TestDriveBooking t) {
		return bookingRepo.save(t);
	}

	@Override
	public void delete(Long id) {
		bookingRepo.deleteById(id);
	}

}
