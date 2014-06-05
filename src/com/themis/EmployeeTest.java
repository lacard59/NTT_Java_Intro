package com.themis;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee dude = new Employee();
		Employee dudette = new Employee();
		
		dude.setName("John");
		dude.setJobTitle("Main Dude");
		dude.setNumOfDependents(3);
		dudette.setName("Jane");
		dudette.setJobTitle("Boss Dudette");
		dudette.setNumOfDependents(1);
		
		System.out.println("Dude named " + dude.getName() + " is a "
				+ dude.getJobTitle() + " with " + dude.getNumOfDependents()
				+ " dependants.");
		
		System.out.println("Dudette named " + dudette.getName() + " is a "
				+ dudette.getJobTitle() + " with " + dudette.getNumOfDependents()
				+ " dependants.");
	}

}
