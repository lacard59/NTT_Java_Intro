package com.themis;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeUnitTest {

	Employee testE = new Employee();
	
	@Test
	public void testJobTitle() {
		
		testE.setJobTitle("Main Dude");
		assertEquals("Job must be Main Dude.", "Main Dude", testE.getJobTitle());	
		testE.setJobTitle("Boss Dudette");
		assertEquals("Job must be Boss Dudette.", "Boss Dudette", testE.getJobTitle());	
	}

	public void testName(){
		testE.setName("Dude");
		assertEquals("Name is Dude", "Dude", testE.getName());
		testE.setName("Dudette");
		assertEquals("Name is Dudette", "Dudette", testE.getName());
	}
	
	public void testNumDep(){
		testE.setNumOfDependents(11);
		assertEquals("Dep is 11", 11, testE.getNumOfDependents());
		testE.setNumOfDependents(1);
		assertEquals("Dep is 1", 1, testE.getNumOfDependents());
	}
}
