package com.themisinc.lab10;

public class Address {
	private String street;
	private String city;
	private String state;
	private String zipCode;
	
	Address(String street, String city, String state, String zipCode) {
		super();
		setStreet(street);
		setCity(city);
		setState(state);
		setZipCode(zipCode);
	}
	public Address() {
		// TODO Auto-generated constructor stub
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (city != null ? !city.equals(address.city) : address.city != null) return false;
        if (state != null ? !state.equals(address.state) : address.state != null) return false;
        if (street != null ? !street.equals(address.street) : address.street != null) return false;
        if (zipCode != null ? !zipCode.equals(address.zipCode) : address.zipCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = street != null ? street.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
        return result;
    }
}
