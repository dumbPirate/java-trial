package cfl.arrayList;

import java.util.*;

public class Clothes implements Comparator<Clothes> {
	private String type;
	private double price;
	
	
	public Clothes(String type, double price) {
		this.type = type;
		this.price = price;
	}
	
	public Clothes() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return type + "\t\t" + price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public int compare(Clothes o1, Clothes o2) {
		// TODO Auto-generated method stub
		return ((Double)o1.price).compareTo(o2.price);
	}
}
