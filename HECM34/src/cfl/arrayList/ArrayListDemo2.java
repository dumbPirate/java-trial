package cfl.arrayList;

import java.util.*;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(new Car("Creta","Red",9.2));
		l.add(new Car("Brezza","Grey",7.2));
		l.add(new Car("Cruise","Blue",16.2));
		l.add(new Car("Compass","Red",18.2));
		l.add(new Car("Verna","Black",21.2));
		
		l.add(new Book("Java","Padmareddy",200));
		l.add(new Book("C++","Balguruswami",150));
		l.add(new Book("Python","Padmareddy",300));
		l.add(new Book("Java","Imtiyaz",250));
		l.add(new Book("C#","Yoyo",100));
		
		System.out.println("Name\t\tColor\t\tPrice");
		System.out.println("---------------------------------------");
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		System.out.println();
		
		System.out.println("Car with red color only ");
		System.out.println("Name\t\tColor\t\tPrice");
		System.out.println("---------------------------------------");
		for (int i = 0; i < l.size(); i++) {
			Object o=l.get(i);
			if (o instanceof Car) {
				Car c=(Car) o;
				if(c.getColor().equals("Red"))
					System.out.println(c+" ");
			}
		}
		System.out.println();
		System.out.println();
		
		System.out.println("Car with Black color and price >20L ");
		System.out.println("Name\t\tColor\t\tPrice");
		System.out.println("---------------------------------------");
		for (int i = 0; i < l.size(); i++) {
			Object o=l.get(i);
			if (o instanceof Car) {
				Car c=(Car) o;
				if(c.getColor().equals("Black")&&c.getPrice()>20)
					System.out.println(c+" ");
			}
		}
		System.out.println();
		System.out.println();
		
		System.out.println("Books by padmareddy ");
		System.out.println("Title\t\tAuthor\t\tPrice");
		System.out.println("---------------------------------------");
		for (int i = 0; i < l.size(); i++) {
			Object o=l.get(i);
			if (o instanceof Book) {
				Book b=(Book) o;
				if(b.getAuthor().equals("Padmareddy"))
					System.out.println(b+" ");
			}
		}
		System.out.println();
		System.out.println();
		
		System.out.println("Different authors of java Book ");
		System.out.println("Title\t\tAuthor\t\tPrice");
		System.out.println("---------------------------------------");
		for (int i = 0; i < l.size(); i++) {
			Object o=l.get(i);
			if (o instanceof Book) {
				Book b=(Book) o;
				if(b.getTitle().equals("Java"))
					System.out.println(b+" ");
			}
		}
	}
}
