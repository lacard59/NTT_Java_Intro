//package com.themisinc.lab10;
//
//import java.text.NumberFormat;
//
////REQUIRES Item and Customer, as well as Sale
////import java.text.NumberFormat;
//
//public class SaleTest {
//	private static Sale sale = null;
//	private static NumberFormat cf = NumberFormat.getCurrencyInstance();
//	public static void main(String[] args) {
//		setupSale();
//		testCalcTotalCost();
//		setupAddAnotherItem();
//		testCalcTotalCost();
//		testGetCust();
//		testGetItems();
////		testAddItemFullCart();
//	}
//
//	// helper methods to set up tests
//	private static void setupSale() {
//		Customer cust = createCustomer();
//		sale = new Sale(cust);
//		sale.addItem(createOneItem());
//		sale.addItem(create2ndItem());
//		sale.addItem(create3rdItem());
//	}
//
//	private static Customer createCustomer() {
//		Customer cust = new Customer();
//		int id = 1234;
//		String lastName  = "Smith";
//		String firstName = "Sally";
//		Address addr = createAddress();
//		cust.setId(id);
//		cust.setLastName(lastName);
//		cust.setFirstName(firstName);
//		cust.setAddress(addr);
//		return cust;
//	}
//
//	private static Address createAddress() {
//		Address addr = new Address();
//		String street =  "123 Main St";
//		String city    = "Anytown";
//		String state   = "ME";
//		String zipCode = "04860";
//		addr.setStreet(street);
//		addr.setCity(city);
//		addr.setState(state);
//		addr.setZipCode(zipCode);
//		return addr;
//	}
//	private static Item createOneItem() {
//		Book item = new Item();
//		int itemId = 97531;
//		String itemTitle = "Moby Dick";
//		String desc = "American classic";
//		double cost = 10.99;
//		double weight = 1.5;
//		item.setId(itemId);
//		item.setName(itemTitle);
//		item.setDesc(desc);
//		item.setCost(cost);
//		item.setWeight(weight);
//		return item;
//	}
//	private static Item create2ndItem() {
//		Item item = new Item();
//		int itemId = 86420;
//		String itemTitle = "Of Mice and Men";;
//		String desc = "Dreams of George and Lenny";
//		double cost = 14.99;
//		double weight = 1.00;
//
//		item.setId(itemId);
//		item.setName(itemTitle);
//		item.setDesc(desc);
//		item.setCost(cost);
//		item.setWeight(weight);
//		return item;
//	}
//	private static Item create3rdItem() {
//		Item item = new Item();
//		int itemId = 12345;
//		String itemTitle = "Castaway";
//		String desc = "All American classic";
//		double cost = 12.99;
//		double weight = 0.85;
//		item.setId(itemId);
//		item.setName(itemTitle);
//		item.setDesc(desc);
//		item.setCost(cost);
//		item.setWeight(weight);
//		return item;
//	}
//	private static Item create4thItem() {
//		Item item = new Item();
//		int itemId = 86420;
//		String itemTitle = "Fantasia";
//		String desc = "Animated classic";
//		double cost = 18.99;
//		double weight = 1.25;
//
//		item.setId(itemId);
//		item.setName(itemTitle);
//		item.setDesc(desc);
//		item.setCost(cost);
//		item.setWeight(weight);
//		return item;
//	}
//	private static void setupAddAnotherItem() {
//		sale.addItem(create4thItem());
//	}
//
//	public static void testCalcTotalCost(){
//		sale.calcTotalCost();
//		System.out.println(cf.format(sale.getTaxAmount()) + "\n"+
//				cf.format(sale.getShippingCost())+ "\n"+ cf.format(sale.getTotalCost()));
//	}
//
//	public static void testGetCust(){
//		System.out.println(sale.getCust().getLastName());
//	}
//
//	public static void testGetItems(){
//		for (int i = 0; i < sale.getItems().length; i++) {
//			if (sale.getItems()[i] != null){
//				System.out.println(sale.getItems()[i].getName());
//			}
//		}
//	}
//}
