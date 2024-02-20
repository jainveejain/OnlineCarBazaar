package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.TestDriveBooking;

@Repository
public interface TestDriveBookingRepository extends JpaRepository<TestDriveBooking, Long> {

}
