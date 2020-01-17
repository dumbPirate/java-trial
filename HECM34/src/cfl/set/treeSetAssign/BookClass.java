package cfl.set.treeSetAssign;
import java.util.*;
public class BookClass {
	public static void main(String[] args) {
		Set<Book> s=new TreeSet<Book>(new Book());
		
		s.add(new Book("No can do","No one",560.45));
		s.add(new Book("How we learn","Benedict carey",300.45));
		s.add(new Book("Java","Padmareddy",690.35));
		s.add(new Book("C++","Balguruswami",100.85));
		s.add(new Book("Can't hurt me","David goggins",460.25));
		s.add(new Book("Python","David",50.15));

		System.out.println("Title\t\tAuthor\t\tPrice");
		Iterator<Book> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
