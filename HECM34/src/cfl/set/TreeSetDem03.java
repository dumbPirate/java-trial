package cfl.set;
import java.util.*;
public class TreeSetDem03 {
	public static void main(String[] args) 
	{
		NavigableSet<Student> t=new TreeSet<Student>();
		
		t.add(new Student("akd",10,123.2));
		t.add(new Student("akt",40,13.2));
		t.add(new Student("zte",20,69.2));
		t.add(new Student("akg",30,23.2));
		t.add(new Student("jbl",34,75.2));
		t.add(new Student("mil",69,45.2));
		
		System.out.println("Name\t\tId\t\tMarks");
		System.out.println("---------------------------------------");
		Iterator<Student> itr=t.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
