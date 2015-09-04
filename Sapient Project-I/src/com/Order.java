package com;

public class Order {
	private String date;
	public String getDate() {return date;}
	public void setDate(String date) {this.date = date;}
	
	
	private String status;
	public String getStatus() {return status;}
	public void setStatus(String status) {this.status = status;}
	
	
	private NewCustomer customer;
	public NewCustomer getCustomer() {return customer;}
	public void setCustomer(NewCustomer customer) {this.customer = customer;}
	
	private int payment;
	public int getPayment() {return payment;}
	public void setPayment(int payment) {this.payment = payment;}
	
	
	private OrderDetail orderdetail = new OrderDetail();
	public OrderDetail getOrderdetail() {return orderdetail;}
	public void setOrderdetail(OrderDetail orderdetail) {this.orderdetail = orderdetail;}
	
	
	public void calcTax(){
	}
	public void calcTotal(){
	}
	public void calctotalWeight(){
	}

}
