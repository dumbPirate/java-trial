package cloning.shallow;

public class Student implements Cloneable
{
	private String name;
	private int id;
	private double marks;
	

	public Student(String name, int id, double marks) {
		this.name = name;
		this.id = id;
		this.marks = marks;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() 
	{	
		return "Name: "+name+" Id: "+id+" Marks: "+marks;
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
	

}
