package com.app.entities;

import java.util.Date;

public class Vehicle_varient {
	private int id;
	private String type;
	private String color;
	private String varient_name;
	private Date luanch_date;
	private String description;
	private boolean isAvailable;
	private double exShowroom_price;
	private String features;
	public Vehicle_varient(int id, String type, String color, String varient_name, Date luanch_date, String description,
			boolean isAvailable, double exShowroom_price, String features) {
		super();
		this.id = id;
		this.type = type;
		this.color = color;
		this.varient_name = varient_name;
		this.luanch_date = luanch_date;
		this.description = description;
		this.isAvailable = isAvailable;
		this.exShowroom_price = exShowroom_price;
		this.features = features;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getVarient_name() {
		return varient_name;
	}
	public void setVarient_name(String varient_name) {
		this.varient_name = varient_name;
	}
	public Date getLuanch_date() {
		return luanch_date;
	}
	public void setLuanch_date(Date luanch_date) {
		this.luanch_date = luanch_date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public double getExShowroom_price() {
		return exShowroom_price;
	}
	public void setExShowroom_price(double exShowroom_price) {
		this.exShowroom_price = exShowroom_price;
	}
	public String getFeatures() {
		return features;
	}
	public void setFeatures(String features) {
		this.features = features;
	}
	@Override
	public String toString() {
		return "Vehicle_varient [id=" + id + ", type=" + type + ", color=" + color + ", varient_name=" + varient_name
				+ ", luanch_date=" + luanch_date + ", description=" + description + ", isAvailable=" + isAvailable
				+ ", exShowroom_price=" + exShowroom_price + ", features=" + features + "]";
	}
	

}
