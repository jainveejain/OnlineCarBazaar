package com.app.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Vehicle extends BaseEntity {
	@Column(length = 40)
	private String type;
	@Column(length = 40)
	private String model;
	@Column(length = 40)
	private String brand;
	@Column
	private LocalDate launch_date;
	@Column(length = 1000)
	private String description;
	@Column
	private boolean isActive;
	
	@OneToMany(mappedBy = "vehicle",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JsonIgnoreProperties("vehicle")
	private List<VehicleVariant> varient;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public LocalDate getLaunch_date() {
		return launch_date;
	}

	public void setLaunch_date(LocalDate launch_date) {
		this.launch_date = launch_date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public List<VehicleVariant> getVarient() {
		return varient;
	}

	public void setVarient(List<VehicleVariant> varient) {
		this.varient = varient;
	}
	
	
}
