package cfl.map.hashmap;
import java.util.Map.Entry;
import java.util.*;
public class HashMapDemo5 {
	public static void main(String[] args) {
		
		Map<Character,Integer> m=new HashMap
				<Character,Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		int i=0;
		while(i<s.length())
		{
			if(m.get(s.charAt(i))==null)
				m.put(s.charAt(i), 1);
			else
				m.put(s.charAt(i),m.get(s.charAt(i))+1);
			i++;
		}
		System.out.println(m);
	}

}
