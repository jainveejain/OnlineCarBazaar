package com.app.entities;

public class Payment {
private int payment_id;
private String payment_status;
private int user_id;
private int order_id;

public Payment(int payment_id, String payment_status, int user_id, int order_id) {
	super();
	this.payment_id = payment_id;
	this.payment_status = payment_status;
	this.user_id = user_id;
	this.order_id = order_id;
}
public int getPayment_id() {
	return payment_id;
}
public void setPayment_id(int payment_id) {
	this.payment_id = payment_id;
}
public String getPayment_status() {
	return payment_status;
}
public void setPayment_status(String payment_status) {
	this.payment_status = payment_status;
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public int getOrder_id() {
	return order_id;
}
public void setOrder_id(int order_id) {
	this.order_id = order_id;
}
@Override
public String toString() {
	return "Payment [payment_id=" + payment_id + ", payment_status=" + payment_status + ", user_id=" + user_id
			+ ", order_id=" + order_id + "]";
} 


}
