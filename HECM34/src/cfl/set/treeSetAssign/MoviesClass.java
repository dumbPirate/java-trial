package cfl.set.treeSetAssign;
import java.util.*;
public class MoviesClass {
	public static void main(String[] args) {
		
		Set<Movies> s=new TreeSet<Movies>(new Movies());
	
		s.add(new Movies("Bahubali",2014));
		s.add(new Movies("Stree",2018));
		s.add(new Movies("Spiderman",2008));
		s.add(new Movies("John Wick",2014));
		s.add(new Movies("Angry Birds",2017));
		s.add(new Movies("Dark Knight",2012));
		
		Iterator<Movies> itr=s.iterator();
		System.out.println("Name\t\tYear");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
