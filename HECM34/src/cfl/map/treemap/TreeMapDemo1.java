package cfl.map.treemap;
import java.util.*;
import java.util.Map.Entry;
public class TreeMapDemo1
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m=new TreeMap<Integer,String>();
		List<String> s=new ArrayList<String>();
		List<Integer> s1=new ArrayList<Integer>();
		m.put(20, "Qsp");
		m.put(40, "Hebbal");
		m.put(70, "Jsp");
		m.put(10, "Hello");
		m.put(30, "World");
		m.put(60, "Howdy");
		m.put(50, "YeeHaw");
		
		System.out.println("Int\t\tString");
		System.out.println("--------------------------");
		Iterator<Entry<Integer,String>> itr=m.entrySet().iterator();
		while(itr.hasNext())
		{
			Entry<Integer, String> e=itr.next();
			System.out.println(e.getKey()+"\t\t"+e.getValue());
			s.add(e.getValue());
			s1.add(e.getKey());
		}
		Collections.sort(s);
		Collections.sort(s1);
		itr=m.entrySet().iterator();
		int i=0;
		while(i<m.size())
		{
			m.put(s1.get(i), s.get(i));
			i++;
			
		}
		
		System.out.println("--------------------------");
		itr=m.entrySet().iterator();
		while(itr.hasNext())
		{
			Entry<Integer, String> e=itr.next();
			System.out.println(e.getKey()+"\t\t"+e.getValue());
		}
		
	}
}
