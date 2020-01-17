package cfl.set;

import java.util.*;

public class HashSetDemo1 {
	public static void main(String[] args) {
		
		Set<Integer> s=new HashSet<Integer>();
		s.add(69);
		s.add(20);
		s.add(78);
		s.add(69);
		s.add(23);
		s.add(55);
		s.add(99);
		
		System.out.println(s);
		List<Integer> l= new ArrayList<Integer>(s);
		Collections.sort(l);
		System.out.println("After sorting");
		System.out.println(l);
		
	
	}

}
