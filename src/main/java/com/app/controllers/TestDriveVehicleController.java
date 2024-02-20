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

import com.app.entities.TestDriveVehicle;
import com.app.services.ITestDriveVehicleService;

@RestController
@RequestMapping("/testDriveVehicle")
public class TestDriveVehicleController {

	@Autowired
	private ITestDriveVehicleService tdvService;
	
	@GetMapping
	private List<TestDriveVehicle> getAll(){
		return tdvService.getAll();
	}
	
	@PostMapping
	private TestDriveVehicle addTestDriveVehicle(@RequestBody TestDriveVehicle tdv){
		return tdvService.add(tdv);
	}
	
	@PutMapping
	private TestDriveVehicle modifyTestDriveVehicle(@RequestBody TestDriveVehicle tdv){
		return tdvService.add(tdv);
	}
	
	@DeleteMapping
	private void modifyTestDriveVehicle(@RequestParam Long id){
		tdvService.delete(id);
	}
}
