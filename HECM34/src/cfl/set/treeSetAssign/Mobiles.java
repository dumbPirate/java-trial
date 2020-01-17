package cfl.set.treeSetAssign;

import java.util.*;

public class Mobiles implements Comparator<Mobiles>{

	private String name;
	private String color;
	private double price;
	
	public Mobiles(String name, String color, double price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}
	public Mobiles() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return name + "\t" + color + "\t" + price;
	}
	@Override
	public int compare(Mobiles o1, Mobiles o2) {
		// TODO Auto-generated method stub
		return ((Double)o2.price).compareTo(o1.price);
	}

}
