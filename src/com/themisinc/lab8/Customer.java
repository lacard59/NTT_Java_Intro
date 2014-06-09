package com.themisinc.lab8;

import java.util.Date;

public class Customer {
	private int id;
	private String lastName;
	private String firstName;
	private Address address;
	private Date lastOrderDate;
	private double lastOrderAmount;
	
	public Customer(int id, String lastName, String firstName, Address address,
			Date lastOrderDate, double lastOrderAmount) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.lastOrderDate = lastOrderDate;
		this.lastOrderAmount = lastOrderAmount;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Date getLastOrderDate() {
		return lastOrderDate;
	}
	public void setLastOrderDate(Date lastOrderDate) {
		this.lastOrderDate = lastOrderDate;
	}
	public double getLastOrderAmount() {
		return lastOrderAmount;
	}
	public void setLastOrderAmount(double lastOrderAmount) {
		this.lastOrderAmount = lastOrderAmount;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", lastName=" + lastName + ", firstName="
				+ firstName + ", address=" + address + ", lastOrderDate="
				+ lastOrderDate + ", lastOrderAmount=" + lastOrderAmount + "]";
	}
	
	
}
