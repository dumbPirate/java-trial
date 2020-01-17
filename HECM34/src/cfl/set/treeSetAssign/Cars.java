package cfl.set.treeSetAssign;

import java.util.*;

public class Cars implements Comparator<Cars>{

	private String name;
	private long year;
	private double price;
	
	
	public Cars(String name, long year, double price) {
		
		this.name = name;
		
		this.year = year;
		this.price = price;
	}

	public Cars() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getYear() {
		return year;
	}

	public void setYear(long year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return name + "\t" + price + "\t" + year;
	}

	@Override
	public int compare(Cars o1, Cars o2) {
		// TODO Auto-generated method stub
		
		  if(o1.price==o2.price) { 
			  return ((Long)o1.year).compareTo(o2.year);
		  } 
		  else
			return ((Double)o1.price).compareTo(o2.price);
	}
	

}
