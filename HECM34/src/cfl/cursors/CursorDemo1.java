package cfl.cursors;
import java.util.*;
public class CursorDemo1 {
	public static void main(String[] args) {
		Set<Integer> s=new HashSet<Integer>();
		int sum=0;
		s.add(20);
		s.add(69);
		s.add(10);
		s.add(15);
		s.add(14);
		
		Iterator<Integer> itr=s.iterator();
		while(itr.hasNext())
		{
			Integer i=itr.next();
			if(i%2!=0)
			{
				itr.remove();
			}
		}
		System.out.println("The sum is "+s);
	}
}
