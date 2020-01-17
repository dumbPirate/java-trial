package cfl.map.hashmap;

import java.util.Map.Entry;
import java.util.*;

public class HashMapDemo1 {
	public static void main(String[] args) {
		
		Map<Integer, String> m=new HashMap<Integer,String>();
		
		m.put(10,"Jsp");
		m.put(20,"Json");
		m.put(30,"Php");
		m.put(40,"Hi");
		m.put(90,"Java");
		m.put(60,"C++");
		m.put(70,"Qsp");
		System.out.println("keys\t\tvalues");
		System.out.println("------------------------");
		
		Set<Entry<Integer,String>> s=m.entrySet();
		Iterator<Entry<Integer,String>> itr=s.iterator();
		
		while(itr.hasNext())
		{
			Entry<Integer,String> e=itr.next();
			System.out.println(e.getKey()+"\t\t"+e.getValue());
		}
	}

}
