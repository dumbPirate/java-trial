package cfl.arrayList;

import java.util.*;

public class Generics2 {
	public static void main(String[] args) {
		List<Student> l=new ArrayList<Student>();
		
		l.add(new Student("Mav",1,60.3));
		l.add(new Student("Domm",2,50.3));
		l.add(new Student("Iq",3,70.3));
		l.add(new Student("Chuck",4,90.3));
		l.add(new Student("Zook",5,69.3));
		
		System.out.println("Name\t\tId\t\tMarks");
		System.out.println("---------------------------------------");
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		System.out.println("Only student details whose marks are between 60 and 70 ");
		System.out.println("Name\t\tId\t\tMarks");
		System.out.println("---------------------------------------");
		for (int i = 0; i < l.size(); i++) {
			Student o=l.get(i);
			if(o.getMarks()>60&&o.getMarks()<70)
			System.out.println(o+" ");
			
		}
	}

}
