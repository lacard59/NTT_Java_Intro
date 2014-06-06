package com.themisinc.lab3;

import static org.junit.Assert.*;
import org.junit.Test;

public class AddressUnitTest {
	
	Address testAdd = new Address();
	
	@Test
	public void testStreet() {		
		testAdd.setStreet("123 Hello Ave.");
		assertEquals("Si", "123 Hello Ave.", testAdd.getStreet());
		testAdd.setStreet("9981 Sycamore St.");
		assertEquals("Si", "9981 Sycamore St.", testAdd.getStreet());
	}
	
	public void testCity() {		
		testAdd.setCity("Chicago");
		assertEquals("Si", "Chicago", testAdd.getCity());
		testAdd.setCity("Orlando");
		assertEquals("Si", "Orlando", testAdd.getCity());
	}
	
	public void testZipCode() {		
		testAdd.setZipCode("12345");
		assertEquals("Si", "12345", testAdd.getZipCode());
		testAdd.setZipCode("98765");
		assertEquals("Si", "98765", testAdd.getZipCode());
	}
	
	public void testState() {		
		testAdd.setState("MN");
		assertEquals("Si", "MN", testAdd.getState());
		testAdd.setState("NV");
		assertEquals("Si", "NV", testAdd.getState());
	}



}
