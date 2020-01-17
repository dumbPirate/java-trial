package cfl.set;

import java.util.*;

public class TreeSetDemo3 {
	public static void main(String[] args) {
		
		Set<Student> s=new TreeSet<Student>();
		
		s.add(new Student("A",10,36.9));
		s.add(new Student("B",60,76.9));
		s.add(new Student("C",70,96.9));
		s.add(new Student("D",20,56.9));
		s.add(new Student("E",30,76.9));		
		s.add(new Student("F",40,86.9));
		
		System.out.println("name\t\tid\t\tmarks");
		System.out.println("-------------------------------------");
		Iterator<Student> itr=s.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	
		System.out.println("-------------------------------------");
		List<Student> l=new ArrayList<Student>(s);
		Collections.reverse(l);
		itr=l.iterator();

		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
