package com.app.entities;

public class Order {
private int id;
private int vehicle_id;
private String user;
private double final_price;
private String delivery_address;
private int varient_id;

public Order(int id, int vehicle_id, String user, double final_price, String delivery_address, int varient_id) {
	super();
	this.id = id;
	this.vehicle_id = vehicle_id;
	this.user = user;
	this.final_price = final_price;
	this.delivery_address = delivery_address;
	this.varient_id = varient_id;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getVehicle_id() {
	return vehicle_id;
}
public void setVehicle_id(int vehicle_id) {
	this.vehicle_id = vehicle_id;
}
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public double getFinal_price() {
	return final_price;
}
public void setFinal_price(double final_price) {
	this.final_price = final_price;
}
public String getDelivery_address() {
	return delivery_address;
}
public void setDelivery_address(String delivery_address) {
	this.delivery_address = delivery_address;
}
public int getVarient_id() {
	return varient_id;
}
public void setVarient_id(int varient_id) {
	this.varient_id = varient_id;
}
@Override
public String toString() {
	return "Order [id=" + id + ", vehicle_id=" + vehicle_id + ", user=" + user + ", final_price=" + final_price
			+ ", delivery_address=" + delivery_address + ", varient_id=" + varient_id + "]";
}


}
