package cfl.arrayList;
import java.util.*;
public class ArrayListDemo3 {
	public static void main(String[] args) {
		
		List<Clothes> l=new ArrayList<Clothes>();
		
		l.add(new Clothes("Cotton",234.56));
		l.add(new Clothes("Polyester",834.96));
		l.add(new Clothes("Acleric",534.6));
		l.add(new Clothes("Jute",2234.5));
		l.add(new Clothes("Wool",1234.21));
		l.add(new Clothes("Skin",12234.69));
				
		System.out.println("Before sorting");
		Iterator<Clothes> itr=l.iterator();
		System.out.println("Type\t\tPrice");
		System.out.println("----------------------------");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("After sorting");
		Collections.sort(l, new Clothes());
		Iterator<Clothes> itr1=l.iterator();
		System.out.println("Type\t\tPrice");
		System.out.println("----------------------------");
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}
}
