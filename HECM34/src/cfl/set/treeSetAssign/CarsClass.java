package cfl.set.treeSetAssign;
import java.util.*;
public class CarsClass {
	public static void main(String[] args) {
		
		Set<Cars> s=new TreeSet<Cars>(new Cars());
		
		s.add(new Cars("Ertiga",2012,805000.12));
		s.add(new Cars("Dzire",2015,605000.32));
		s.add(new Cars("Innova",2015,805000.12));
		s.add(new Cars("C class",2016,6005000.12));
		s.add(new Cars("i20",2018,755000.54));
		s.add(new Cars("Xuv500",2019,1305000.98));
		
		System.out.println("Name\tYear\tPrice");
		System.out.println("-------------------------------");
		
		Iterator<Cars> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
