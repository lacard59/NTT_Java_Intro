package com.themisinc.lab4;

import java.text.NumberFormat;

public class TaxCalculatorTest {

	public static void main(String[] args) {

		double sub = 555572.39;
		String state = "asdfasd";
		double taxAmount = 0;
		taxAmount = TaxCalculator.getTax(sub, state);
		NumberFormat numFor = NumberFormat.getCurrencyInstance();
		
		System.out.println(numFor.format(taxAmount)+ '\n' + numFor.format(sub));		
	}
}
