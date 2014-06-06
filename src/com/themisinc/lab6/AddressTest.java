package com.themisinc.lab6;

public class AddressTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address addr = new Address("1234 Smith Ave.", "Springfield", "CA", "10293");
		addr.setCity("Louisville");
		addr.setState("CA");
		addr.setZipCode("40219");
		addr.setStreet("123 Main Street");
		System.out.println(addr);
		Address test = new Address("1234 Smith Ave.", "Springfield", null, "10293");
		System.out.println(test);
		Address test1 = new Address("1234 Smith Ave.", "Springfield", "X", "10293");
		System.out.println(test1);
		Address test2 = new Address("1234 Smith Ave.", "Springfield", "CA", "10293");
		System.out.println(test2);
	}

}
