package com.themisinc.lab8;

public class ShippingCalculator {
	private static String[] stateCodes = {"AK","HI","ME","IL","CA"};
	private static double[] costPerLB = {6.0, 10.0, 2.5, 4.0, 5.0};
	
	public static double getCost(Item[] items, String stateCode){
		
		double cost = 0.0;
		double totalWeight = 0.0;
		for (int i = 0; i < items.length; i++) {
			if (items[i] != null){
				totalWeight += items[i].getWeight();
			}
		}
		
		for (int i = 0; i < stateCodes.length; i++) {
			if (stateCode == stateCodes[i]){
				cost = costPerLB[i]*totalWeight;
				return cost;
			}
		}
		System.out.println("State code is not supported.");
		cost = -1.0;
		return cost;
	}
}
