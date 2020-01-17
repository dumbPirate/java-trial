package cfl.project;

import java.util.*;

import cfl.set.Student;

public class Studentdb {
	ArrayList<Student1> l=new ArrayList<Student1>();
	Scanner sc;
	
	public Studentdb(Scanner sc) 
	{
		this.sc=sc;	
	}

	public void addStudent()
	{	System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the id");
		int id=sc.nextInt();
		System.out.println("Enter the marks");
		double marks=sc.nextDouble();
		System.out.println("Enter the phone no.");
		long phone =sc.nextLong();
		l.add(new Student1(name,id,marks,phone));
	}
	
	public void dispStudent()
	{
		ListIterator<Student1> ltr=l.listIterator();
		System.out.println("Name\t\tId\t\tMarks\t\tMobile");
		/*
		 * for(int i=0;i<l.size();i++) 
		 * 		System.out.println(l.get(i));
		 */
		while(ltr.hasNext())
		{
			Student1 s=ltr.next();
			System.out.println(s);
		}
			
		System.out.println("-------------------------------------------------------");
	}
	
	public void searchStudent()
	{
		ListIterator<Student1> ltr=l.listIterator();
		System.out.println("Enter the student id to be searched");
		int id=sc.nextInt();
		/*for(int i=0;i<l.size();i++)
		{
			Student s=l.get(i);
			if(s.getId()==id)
			{
				System.out.println("The student is present in db");
				return;
			}
		}
		System.out.println("The student is not present in db");
		*/
		while(ltr.hasNext())
		{
			Student1 s=ltr.next();
			if(s.getId()==id)
			{
				System.out.println("The student is present in db");
				return;
			}
		}
			System.out.println("The student is not present in db");
	}
	
	public void removeStudent()
	{
		ListIterator<Student1> ltr=l.listIterator();
		System.out.println("Enter the student id to be removed");
		int id=sc.nextInt();
		/*for(int i=0;i<l.size();i++)
		{
			Student s=l.get(i);
			if(s.getId()==id)
			{
				l.remove(i);
				System.out.println("Student removed from db");
			}
				
			else
				System.out.println("the student is not present in db");
		}*/
		while(ltr.hasNext())
		{
			Student1 s=ltr.next();
			if(s.getId()==id)
			{
				ltr.remove();
				System.out.println("Student removed from db");
			}
			else
				System.out.println("the student is not present in db");
		}
	}
	
	public void updateStudent()
	{
		ListIterator<Student1> ltr=l.listIterator();
		if(!l.isEmpty())
		{
			System.out.println("Enter the id to be Updated");
			int id=sc.nextInt();
			for(int i=0;i<l.size();i++)
			{
				Student1 s=l.get(i);
				if(s.getId()==id)
				{
					System.out.println("1.Marks\n2.Mobile No.");
					int ch=sc.nextInt();
					switch(ch)
					{
					case 1:System.out.println("Enter the new marks");
							double marks=sc.nextDouble();
							s.setMarks(marks);
							break;
					case 2:
						System.out.println("Enter the new phone no.");
						long phn=sc.nextLong();
						s.setPhone(phn);
						break;
					}	
				}
				else
					System.out.println("Invalid Id");
			}
		}
		else
			System.out.println("List is empty");
	}
	
	public void sortStudent()
	{
		
	}

}
