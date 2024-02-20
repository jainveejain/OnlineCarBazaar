package com.app.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.app.enums.Role;

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
public class User extends BaseEntity {
	@Column(length = 40)
	private String firstName;
	@Column(length = 40)
	private String lastName;
	@Column
	private LocalDate dob;
	@Column(length = 100)
	private String addressLine;
	@Column(length = 40)
	private String password;
	@Column(length = 10)
	private String phoneNo;
	@Column(length = 40)
	private String city;
	@Column
	private int postalCode;
	@Column(length = 40)
	private String state;
	@Column(length = 40)
	private String country;
	@Column
	private Role role;

//	@OneToMany(mappedBy = "user")
//	private List<Order> orders;

//	@OneToMany(mappedBy = "user")
//	private List<TestDrive_booking> bookings;
//
//	@OneToMany(mappedBy = "user")
//	private List<Payment> payments;

}
