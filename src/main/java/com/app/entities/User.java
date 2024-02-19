package com.app.entities;

import java.util.Date;

public class User {
	
	private int id;
	private String firstName;
	private String lastName;
	private Date dob;
	private String addressLine;
	private String password;
	private String phoneNo;
	private String city;
	private String postalCode;
	private String state;
	private String country;
	//private enum Role;
	
	public int getId() {
		return id;
	}
	public User(int id, String firstName, String lastName, Date dob, String addressLine, String password,
			String phoneNo, String city, String postalCode, String state, String country) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.addressLine = addressLine;
		this.password = password;
		this.phoneNo = phoneNo;
		this.city = city;
		this.postalCode = postalCode;
		this.state = state;
		this.country = country;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", addressLine=" + addressLine + ", password=" + password + ", phoneNo=" + phoneNo + ", city=" + city
				+ ", postalCode=" + postalCode + ", state=" + state + ", country=" + country + "]";
	}

	
}


