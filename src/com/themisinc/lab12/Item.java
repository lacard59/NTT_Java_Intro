package com.themisinc.lab12;

import java.io.Serializable;

public abstract class Item implements Serializable {
	private int id;
	private String name;
	private String desc;
	private double cost;
	private double weight;	
	
	public Item(){		
	}
	
	public Item(int id, String name, String desc, double cost, double weight) {
		super();
		setId(id);
		setName(name);
		setDesc(desc);
		setCost(cost);
		setWeight(weight);
	}
	
	public Item(int id, String name){
		super();
		setId(id);
		setName(name);
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
        if (cost > 0.00 && cost <= 100.00) {
            this.cost = cost;
        }
        else System.out.println("Enter a valid cost for the Item.");
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Item{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", desc='").append(desc).append('\'');
        sb.append(", cost=").append(cost);
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (Double.compare(item.cost, cost) != 0) return false;
        if (id != item.id) return false;
        if (Double.compare(item.weight, weight) != 0) return false;
        if (desc != null ? !desc.equals(item.desc) : item.desc != null) return false;
        if (!name.equals(item.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + (desc != null ? desc.hashCode() : 0);
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


}
