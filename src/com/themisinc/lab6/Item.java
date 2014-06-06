package com.themisinc.lab6;

public class Item {
	private int id;
	private String name;
	private String desc;
	private double cost;
	private double weight;	
	
	public Item(int id, String name, String desc, double cost, double weight) {
		super();
		this.id = id;
		this.name = name;
		setDesc(desc);
		setCost(cost);
		this.weight = weight;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		if (cost <= 100.00){
			this.cost = cost;
		}
		else System.out.println("Insert a valid value for cost. (Not more than 100.00)");
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", desc=" + desc
				+ ", cost=" + cost + ", weight=" + weight + "]";
	}
	
	
	
}
