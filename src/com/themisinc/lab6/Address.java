package com.themisinc.lab6;

public class Address {
	private String street;
	private String city;
	private String state;
	private String zipCode;
	
	Address(String street, String city, String state, String zipCode) {
		super();
		this.street = street;
		this.city = city;
		setState(state);
		this.zipCode = zipCode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		if (state == null) System.out.println("Enter a value for state.");
		else if (state.length() != 2) System.out.println("State must be 2 charaters.");
		else if (state == "AK" || state == "HI" || state == "ME" || state == "IL" || state == "CA") this.state = state;
		else System.out.println("Type supported state.");
	}
	
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}	
	
	public String toString(){
		String str = getStreet() + ", " + getCity() + ", " + getState() 
				+ " " + getZipCode();
		return str;
	}
	
}
