package cfl.set.treeSetAssign;
import java.util.*;
public class MobilesClass {
	public static void main(String[] args) {	
	
		SortedSet<Mobiles> s=new TreeSet<Mobiles>(new Mobiles());
		
		s.add(new Mobiles("Galaxy s9","Coral Blue",59000.0));
		s.add(new Mobiles("GThink G6","Glistening Gray",49000.28));
		s.add(new Mobiles("iPhone X","rose Gold",99000.9));
		s.add(new Mobiles("Xperia 5","Satan Black",45000.0));
		s.add(new Mobiles("Huwawei","Aqua Green",59000.0));
		s.add(new Mobiles("Galaxy M30s","Coral Green",9999.9));
		
		Iterator<Mobiles> itr=s.iterator();
		System.out.println("Name\t\tColor\t\tPrice");
		System.out.println("---------------------------------");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		System.out.println("Costliest phone is "+s.first().getName()+
				" with price "+s.first().getPrice());
		  
		System.out.println("Cheapest phone is "+s.last().getName()+
				" with price "+s.last().getPrice());
	}
}
