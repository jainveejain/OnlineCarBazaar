package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.VehicleVariant;
import com.app.services.IVehicleVariantService;

@RestController
@RequestMapping("/vehicleVariant")
@CrossOrigin(origins = "*")
public class VehicleVariantController {

	@Autowired
	private IVehicleVariantService vvService;
	
	@GetMapping
	private List<VehicleVariant> getAll(){
		return vvService.getAll();
	}
	
	@PostMapping
	private VehicleVariant addVehicleVariant(@RequestBody VehicleVariant v){
		return vvService.add(v);
	}
	
	@PutMapping
	private VehicleVariant modifyVehicleVariant(@RequestBody VehicleVariant v){
		return vvService.add(v);
	}
	
	@DeleteMapping
	private void modifyVehicleVariant(@RequestParam Long id){
		vvService.delete(id);
	}
}
