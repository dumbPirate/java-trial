package cfl.set;
import java.util.*;
public class TreeSetDemo2 implements Comparator<String>
{
	public static void main(String[] args) 
	{
		NavigableSet<String> t=new TreeSet<String>(new TreeSetDemo2());
		
		t.add("sdf");
		t.add("dgy");
		t.add("dfg");
		t.add("igh");
		t.add("akd");
		t.add("ogd");
		t.add("@sd");
		
		System.out.println(t.first());
		System.out.println(t);
	}
	@Override
	public int compare(String c1,String c2)
	{
		return c2.compareTo(c1);
	}
	
}
