package com.app.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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
//	
//	@OneToMany(mappedBy = "Vehicle")
//	private List<Vehicle_varient> varient;
}
