package com.themisinc.lab8;

import java.text.NumberFormat;

public class ShippingCalculatorTest {
	static NumberFormat numFor = NumberFormat.getCurrencyInstance();
	private static Item createOneItem() {
		Item item = new Item();
		int itemId = 97531;
		String itemTitle = "Moby Dick";
		String desc = "American classic";
		double cost = 10.99;
		double weight = 1.5;
		item.setId(itemId);
		item.setName(itemTitle);
		item.setDescription(desc);
		item.setCost(cost);
		item.setWeight(weight);
		return item;
	}
	private static Item create2ndItem() {
		Item item = new Item();
		int itemId = 86420;
		String itemTitle = "Of Mice and Men";;
		String desc = "Dreams of George and Lenny";
		double cost = 14.99;
		double weight = 1.00;
		
		item.setId(itemId);
		item.setName(itemTitle);
		item.setDescription(desc);
		item.setCost(cost);
		item.setWeight(weight);
		return item;
	}
	private static Item create3rdItem() {
		Item item = new Item();
		int itemId = 12345;
		String itemTitle = "Castaway";
		String desc = "All American classic";
		double cost = 12.99;
		double weight = 0.85;
		item.setId(itemId);
		item.setName(itemTitle);
		item.setDescription(desc);
		item.setCost(cost);
		item.setWeight(weight);
		return item;
	}
	private static Item create4thItem() {
		Item item = new Item();
		int itemId = 86420;
		String itemTitle = "Fantasia";
		String desc = "Animated classic";
		double cost = 18.99;
		double weight = 1.25;
		
		item.setId(itemId);
		item.setName(itemTitle);
		item.setDescription(desc);
		item.setCost(cost);
		item.setWeight(weight);
		return item;
	}
	private static Item[] itemArr = {createOneItem(), create2ndItem(), create3rdItem(), create4thItem()};
	public static void main(String[] args) {
		System.out.println(numFor.format(ShippingCalculator.getCost(itemArr, "AK")));
		System.out.println(numFor.format(ShippingCalculator.getCost(itemArr, "CA")));
		System.out.println(numFor.format(ShippingCalculator.getCost(itemArr, "asdf")));


	}
}
