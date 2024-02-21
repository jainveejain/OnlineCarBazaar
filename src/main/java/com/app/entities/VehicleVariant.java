package com.app.entities;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Getter
@Setter
@Entity
public class VehicleVariant extends BaseEntity {
	@Column(length = 40)
	private String type;
	@Column(length = 40)
	private String color;
	@Column(length = 40)
	private String varient_name;
	@Column
	private LocalDate luanch_date;
	@Column(length = 400)
	private String description;
	@Column
	private boolean isAvailable;
	@Column
	private double exShowroom_price;
	@Column(length = 400)
	private String features;
//	@OneToMany(mappedBy = "VehicleVarientId")
//	private List<TestDriveVehicle> testDriveVehicles ;
	
	@ManyToOne
	@JoinColumn(name = "vehicle")
	@JsonIgnoreProperties("varient")
	private Vehicle vehicle;
}
