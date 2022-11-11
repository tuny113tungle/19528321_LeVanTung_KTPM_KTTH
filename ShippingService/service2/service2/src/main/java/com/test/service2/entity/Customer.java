package com.test.service2.entity;

public class Customer {
 private String CustomerID;
 private String name;
 private String adress;
public String getCustomerID() {
	return CustomerID;
}
public void setCustomerID(String customerID) {
	CustomerID = customerID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public Customer(String customerID, String name, String adress) {
	super();
	CustomerID = customerID;
	this.name = name;
	this.adress = adress;
}
public Customer() {
	super();
}
 
 
}
