package cfl.set;
import java.util.*;
public class Student implements Comparator<Student>,Comparable<Student> {
	private String name;
	private int id;
	private double marks;
	
	
	public Student(String name, int id, double marks) {
		this.name = name;
		this.id = id;
		this.marks = marks;
		
	}
	public Student() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	
  @Override
	public String toString() {
		return name + "\t\t" + id + "\t\t" + marks;
	}
@Override
  public int compare(Student s1,Student s2)
  {
		//based on id
	  //return ((Integer)s1.id).compareTo(s2.id);
	  //return ((Integer)s2.id).compareTo(s1.id);//in desc order
	  
	//based on name
	  //return s1.name.compareTo(s2.name);
	 // return s2.name.compareTo(s1.name);//in desc order
	  
	//based on marks
	  //return ((Double)s1.marks).compareTo((Double)s2.marks);
		return ((Double)s2.marks).compareTo(s1.marks);//in desc order
 
  }
	
@Override
public int compareTo(Student s)
{
	return ((Integer)this.id).compareTo(s.id) ;
}
}
