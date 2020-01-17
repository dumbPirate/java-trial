package cfl.arrayList;

import java.util.*;

public class ArrayListRev {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(12);
		l.add(1.2);
		l.add(true);
		l.add(12f);
		l.add("Hello");
		l.add('a');

		System.out.println("Before reverse: " + l);

		/*
		 * for (int i = 0; i < l.size()/2; i++) 
		 * { 
		 * Object temp=l.get(i);
		 * l.set(i,l.get(l.size()-i-1));
		 *  l.set(l.size()-i-1, temp);
		 * }
		 */

		Collections.reverse(l);
		System.out.println("After reverse: " + l);
		
		List<Integer> lt=new ArrayList<Integer>();
		lt.add(10);
		lt.add(2);
		lt.add(19);
		lt.add(120);
		lt.add(690);
		lt.add(340);
		System.out.println("Before sorting: "+lt);
		Collections.sort(lt);
		System.out.println("After sorting "+lt);
	}
}
