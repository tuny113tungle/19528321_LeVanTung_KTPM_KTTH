package com.test.service1.entity;

public class Shipper {
	private String ShipperId;
	private String name;
	private double price;
	private double km;
	private String CustomerId;
	public String getShipperId() {
		return ShipperId;
	}
	public void setShipperId(String shipperId) {
		ShipperId = shipperId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getKm() {
		return km;
	}
	public void setKm(double km) {
		this.km = km;
	}
	public String getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}
	public Shipper(String shipperId, String name, double price, double km, String customerId) {
		super();
		ShipperId = shipperId;
		this.name = name;
		this.price = price;
		this.km = km;
		CustomerId = customerId;
	}
	public Shipper() {
		super();
	}
	
	
}
