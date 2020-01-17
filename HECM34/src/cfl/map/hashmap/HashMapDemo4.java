package cfl.map.hashmap;
import java.util.Map.Entry;
import java.util.*;

public class HashMapDemo4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Character,Integer> m=new TreeMap<Character,Integer>();
		char a='a';
		int b=1;
		m.put(a, b);
		while(m.get(a)<26)
		{
			b++;
			a++;
			m.put(a, b);
			
		}
		System.out.println("keys\t\tvalues");
		System.out.println("------------------------");
		
		Iterator<Entry<Character,Integer>> itr=m.entrySet().iterator();
		while(itr.hasNext())
		{
			Entry<Character,Integer> e=itr.next();
			System.out.println(e.getKey()+"\t\t"+e.getValue());
		}
		System.out.println("Enter the String");
		String s=sc.next();
		int i=0,sum=0;
		while(i<s.length())
		{
			sum+=m.get(s.charAt(i));
			i++;
		}
		System.out.println(sum);
	}

}
