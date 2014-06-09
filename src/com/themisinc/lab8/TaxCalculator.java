package com.themisinc.lab8;

public class TaxCalculator {
	
	private static double taxRate = -1;
	private static String[] stateCodes = {"AK","HI","ME","IL","CA"};
	private static double[] taxRates = {5.0, 8.0, 4.5, 7.5, 10.0};
	
	public static double getTax(double subtotal, String state){
		taxRate = -1;
		double tax = 0;
		
		for (int i = 0; i < stateCodes.length; i++) {
			if (state == stateCodes[i]){
				taxRate = taxRates[i];		
				break;
			}			
		}
		if (taxRate == -1){
			System.out.println("State is not supported.");
		}
		tax = subtotal * taxRate / 100.0;
		return tax;				
	}
}