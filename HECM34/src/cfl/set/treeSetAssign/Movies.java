package cfl.set.treeSetAssign;

import java.util.*;

public class Movies implements Comparator<Movies> {

	private String name;
	private long date;
	
	public Movies(String name, long date) {
		super();
		this.name = name;
		this.date = date;
	}

	public Movies() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return  name + "\t\t" + date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	@Override
	public int compare(Movies o1, Movies o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
}
