package com.themisinc.lab12;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

public class Sale implements Serializable {
	
	private Customer cust;
	private Item[] items = new Item[10];
	private int itemCount = 0;
	private double taxAmount = 0;
	private double shippingCost = 0;
	private double totalCost = 0;

	public Sale (Customer cust){
		this.cust = cust;
	}

	public Customer getCust() {
		return cust;
	}

	public Item[] getItems() {
		return items;
	}

	public int getItemCount() {
		return itemCount;
	}

	public double getTaxAmount() {
		return taxAmount;
	}

	public double getShippingCost() {
		return shippingCost;
	}

	public double getTotalCost() {
		return totalCost;
	}
	
	public void addItem(Item it){
		if (itemCount < 10){
			items[itemCount] = it;
			itemCount++;
		}
		else {
			System.out.println("The Item Array is full... sorry dude/dudette!");
		}
	}
	
	private double calcSubtotal(){
		double subtotalCost = 0;
		for (int i = 0; i < items.length; i++) {
			if (items[i] != null){
				subtotalCost += items[i].getCost();
			}
		}
		return subtotalCost;
	}
	
	private double calcTaxAmount(double subtotal){
		taxAmount = TaxCalculator.getTax(subtotal, getCust().getAddress().getState());
		return taxAmount;
	}
	
	private double calcShippingCost(){
		shippingCost = ShippingCalculator.getCost(items, getCust().getAddress().getState());
		return shippingCost;
	}
	
	public void calcTotalCost(){
		double sub = calcSubtotal();
		double taxAmount = calcTaxAmount(sub);
		double shippingCost = calcShippingCost();
		totalCost = sub + taxAmount + shippingCost;
	}

    @Override
    public String toString() {
        return "Sale{" +
                "cust=" + cust +
                ", items=" + Arrays.toString(items) +
                ", itemCount=" + itemCount +
                ", taxAmount=" + taxAmount +
                ", shippingCost=" + shippingCost +
                ", totalCost=" + totalCost +
                '}';
    }
}
