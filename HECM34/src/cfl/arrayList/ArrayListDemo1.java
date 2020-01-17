package cfl.arrayList;

import java.util.*;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		List l=new ArrayList();
		
		l.add(new Student("Mav",1,60.3));
		l.add(new Student("Domm",2,50.3));
		l.add(new Student("Iq",3,70.3));
		l.add(new Student("Chuck",4,90.3));
		l.add(new Student("Zook",5,69.3));
		
		l.add(new Employee("Blitz",11,60000.3));
		l.add(new Employee("Duck",12,56000.3));
		l.add(new Employee("Echo",13,86000.3));
		l.add(new Employee("Buck",14,67000.3));
		l.add(new Employee("Zofia",15,34500.3));

		System.out.println("Name\t\tId\t\tMarks");
		System.out.println("---------------------------------------");
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		System.out.println();
		
		System.out.println("Only student details are ");
		System.out.println("Name\t\tId\t\tMarks");
		System.out.println("---------------------------------------");
		for (int i = 0; i < l.size(); i++) {
			Object o=l.get(i);
			if (o instanceof Student) {
				System.out.println(o+" ");
			}
		}
		System.out.println();
		
		System.out.println("Only student details whose marks are between 60 and 70 ");
		System.out.println("Name\t\tId\t\tMarks");
		System.out.println("---------------------------------------");
		for (int i = 0; i < l.size(); i++) {
			Object o=l.get(i);
			if (o instanceof Student ) {
				Student s=(Student)o;
				if(s.getMarks()>60&&s.getMarks()<70)
					System.out.println(o+" ");
			}
		}
		System.out.println();
		
		System.out.println("Only student details whose name starts with M");
		System.out.println("Name\t\tId\t\tMarks");
		System.out.println("---------------------------------------");
		for (int i = 0; i < l.size(); i++) {
			Object o=l.get(i);
			if (o instanceof Student ) {
				Student s=(Student)o;
				if(s.getName().startsWith("M"))
					System.out.println(o+" ");
			}
		}
		System.out.println();
		
		System.out.println("Only student details whose marks are greater than 60");
		System.out.println("Name\t\tId\t\tMarks");
		System.out.println("---------------------------------------");
		for (int i = 0; i < l.size(); i++) {
			Object o=l.get(i);
			if (o instanceof Student ) {
				Student s=(Student)o;
				if(s.getMarks()>60)
					System.out.println(o+" ");
			}
		}
		System.out.println();
		
		System.out.println("Only Emp details whose name starts with B and salary>50k");
		System.out.println("Name\t\tId\t\tSal");
		System.out.println("---------------------------------------");
		for (int i = 0; i < l.size(); i++) {
			Object o=l.get(i);
			if (o instanceof Employee ) {
				Employee s=(Employee)o;
				if(s.getName().startsWith("B")&&s.getSal()>50000)
					System.out.println(o+" ");
			}
		}
		System.out.println();
		
		System.out.println("Only student details whose marks greatest");
		System.out.println("Name\t\tId\t\tMarks");
		System.out.println("---------------------------------------");
		double hmarks=0.0,hsal=0.0;
		for (int i = 0; i < l.size(); i++)
			{
			if(l.get(i) instanceof Student)
				{
					int j;
					hmarks=((Student)l.get(i)).getMarks();
					for (j = i+1; j < l.size(); j++) 
					{
						if(l.get(j) instanceof Student && ((Student)l.get(j)).getMarks()>hmarks)
							hmarks=((Student)l.get(j)).getMarks();
					}
					if(j==l.size())
						break;
				}
			}
	}
}
