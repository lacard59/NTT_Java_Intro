package com.themisinc.lab4;

public class TaxCalculator {
	
	private static double taxRate = -1;
	
	public static double getTax(double subtotal, String state){
		double tax = 0;
		if (state == "AK"){  
			taxRate = 5.0;
		}
		else if (state == "HI"){  
			taxRate = 8.0;
		}
		else if (state == "ME"){  
			taxRate = 4.5;
		}
		else if (state == "IL"){  
			taxRate = 7.5;
		}
		else if (state == "CA"){  
			taxRate = 10.0;
		}
		else {
			System.out.println("Value not supported. Try another one.");
			taxRate = 0.0;
		}
		
		tax = subtotal * taxRate / 100.0;
		return tax;
	};
	
	public void assignTaxRate(String state){
		if (state == "AK"){  
			taxRate = 5.0;
		}
		else if (state == "HI"){  
			taxRate = 8.0;
		}
		else if (state == "ME"){  
			taxRate = 4.5;
		}
		else if (state == "IL"){  
			taxRate = 7.5;
		}
		else if (state == "CA"){  
			taxRate = 10.0;
		}
		else System.out.println("Value not supported. Try another one.");
		taxRate = 0.0;
	};
}
