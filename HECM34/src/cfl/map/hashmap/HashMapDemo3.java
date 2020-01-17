package cfl.map.hashmap;

import java.util.Map.Entry;
import java.util.*;

public class HashMapDemo3 {
	public static void main(String[] args) {
		Map<Integer, String> m=new HashMap<Integer,String>();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter\n1.To enter\n2.display\n"
					+ "3.Search\n"+ "4.Remove\n5.exit");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:System.out.println("Enter emp id and name");
					int id=sc.nextInt();
					String s=sc.next();
					m.put(id, s);
					break;
			case 2:System.out.println("Id\t\tName");
			System.out.println("------------------------");
			
			Iterator<Entry<Integer,String>> itr=m.entrySet().iterator();
			
			while(itr.hasNext())
			{
				Entry<Integer,String> e=itr.next();
				System.out.println(e.getKey()+"\t\t"+e.getValue());
			}
			break;
			case 3:System.out.println("Enter the id to be searched");
					int i=sc.nextInt();
					if(m.containsKey(i))
						System.out.println("Employee is present");
					else
						System.out.println("No such id present");
					break;
			case 4:System.out.println("Enter the id to be removed");
					i=sc.nextInt();
					if(m.containsKey(i))
						m.remove(i);
					else
						System.out.println("No such id present");
				break;
			case 5:System.exit(0);
			default:
				System.out.println("wrong choice");
			}
		}
	}

}
