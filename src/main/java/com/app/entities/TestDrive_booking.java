package com.app.entities;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class TestDrive_booking {

	private int id;
	private String vehicle;
	private String varient;
	private Date schedule_date ;
	private String user;
	private String delivery_address;
	public TestDrive_booking(int id, String vehicle, String varient, Date schedule_date, String user,
			String delivery_address) {
		super();
		this.id = id;
		this.vehicle = vehicle;
		this.varient = varient;
		this.schedule_date = schedule_date;
		this.user = user;
		this.delivery_address = delivery_address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVehicle() {
		return vehicle;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	public String getVarient() {
		return varient;
	}
	public void setVarient(String varient) {
		this.varient = varient;
	}
	public Date getSchedule_date() {
		return schedule_date;
	}
	public void setSchedule_date(Date schedule_date) {
		this.schedule_date = schedule_date;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getDelivery_address() {
		return delivery_address;
	}
	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}
	@Override
	public String toString() {
		return "TestDrive_booking [id=" + id + ", vehicle=" + vehicle + ", varient=" + varient + ", schedule_date="
				+ schedule_date + ", user=" + user + ", delivery_address=" + delivery_address + "]";
	}
	
	
}
