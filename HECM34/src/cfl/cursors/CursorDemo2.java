package cfl.cursors;
import java.util.*;
public class CursorDemo2 {
	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		
		l.add(69);
		l.add(29);
		l.add(12);
		l.add(76);
		l.add(99);
		l.add(150);
		
		ListIterator<Integer> ltr=l.listIterator();
		
		while(ltr.hasNext())
		{
			ltr.next();
		}
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
	}

}
