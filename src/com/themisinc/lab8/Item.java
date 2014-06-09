package com.themisinc.lab8;

public class Item {
	private int id;
	private String name;
	private String desc;
	private double cost;
	private double weight;	
	
	public Item()
	{
		
	}
	
	public Item(int id, String name, String desc, double cost, double weight) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.cost = cost;
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
	public String getDescription() {
		return desc;
	}
	public void setDescription(String desc) {
		this.desc = desc;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
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
