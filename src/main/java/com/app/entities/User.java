package com.app.entities;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.app.enums.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
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
public class User extends BaseEntity {
	@Column(length = 40)
	private String firstName;
	@Column(length = 40)
	private String lastName;
	@Column(length = 40)
	private String email;
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

	@OneToMany(mappedBy = "user",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JsonIgnoreProperties("user")
	private Set<Order> orders;

	@OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
	@JsonIgnoreProperties("user")
	private Set<TestDriveBooking> bookings;

	@OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
	@JsonIgnoreProperties("user")
	private Set<Payment> payments;

}
