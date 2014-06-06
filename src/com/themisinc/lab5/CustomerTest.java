package com.themisinc.lab5;

import java.util.Date;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add = new Address("1234 Smith Ave.", "Springfield", "TX", "10293");
		Customer dude = new Customer(1, "McLovin", "Dude", add, new Date(), 94.99);
		System.out.println(dude);
	}

}
