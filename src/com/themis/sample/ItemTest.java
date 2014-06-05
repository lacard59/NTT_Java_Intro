package com.themis.sample;

public class ItemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item desk = new Item();
		Item chair = new Item();
		
		desk.setName("Oak Desk");
		desk.setPrice(1400);
		desk.setQuantity(2);
		
		chair.setName("Reclining Chair");
		chair.setPrice(70);
		chair.setQuantity(4);
		
		System.out.println("The " + desk.getName() 
				+ " total price is $" 
				+ desk.getPrice() * desk.getQuantity() + ".00");
		
		System.out.println("The " + chair.getName()
				+ " total price is $"
				+ chair.getPrice() * chair.getQuantity() + ".00");

	}

}
