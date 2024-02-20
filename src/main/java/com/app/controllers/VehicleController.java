package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.app.entities.Vehicle;
import com.app.services.IVehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

	@Autowired
	private IVehicleService vehicleService;

	@GetMapping
	private List<Vehicle> getAll() {
		return vehicleService.getAll();
	}

	@PostMapping
	private Vehicle addVehicle(@RequestBody Vehicle vehicle) {
		return vehicleService.addVehicle(vehicle);
	}

	@PutMapping
	private Vehicle modifyVehicle(@RequestBody Vehicle vehicle) {
		return vehicleService.updateVehicle(vehicle);
	}

	@DeleteMapping
	private void deleteVehicle(@RequestParam Long id) {
		vehicleService.deleteVehicle(id);
	}
}
