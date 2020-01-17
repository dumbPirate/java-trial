package cfl.arrayList;

import java.util.*;

public class Generics {
	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		
		l.add("hello");
		l.add("sako");
		l.add("hi");
		l.add("sake");
		l.add("yosa");
		l.add("sick");
		l.add("yeehaw");
		
		for (int i = 0; i < l.size(); i++) {
			
			String str=l.get(i);
			if(str.startsWith("sa"))
				System.out.println(str);
		}
		
	}

}
