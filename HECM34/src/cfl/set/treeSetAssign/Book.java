package cfl.set.treeSetAssign;

import java.util.Comparator;

public class Book implements Comparator<Book>{
	private String title;
	private String author;
	private double price;
	
	
	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}


	public Book() {
		// TODO Auto-generated constructor stub
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return title + "\t\t" + author + "\t\t" + price;
	}


	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return ((Double)o1.price).compareTo(o2.price);
	}
}
