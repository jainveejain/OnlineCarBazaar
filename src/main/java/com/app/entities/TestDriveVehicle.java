package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
@Entity
public class TestDriveVehicle extends BaseEntity {
	
//	@ManyToOne
//	@JoinColumn( name = "VehicleVarientId")
//	private Vehicle_varient varient;
	
	@Column(length = 40)
	private int rto_number;
	@Column(length = 40)
	private boolean available_city;
	@Column(length = 40)
	private boolean available_state;

}
