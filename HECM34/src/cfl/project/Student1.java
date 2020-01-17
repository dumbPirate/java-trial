package cfl.project;

public class Student1 {
	private String name;
	private int id;
	private double marks;
	private long phone;
	
	public Student1(String name, int id, double marks,long phone) {
		this.name = name;
		this.id = id;
		this.marks = marks;
		this.phone=phone;
	}
	
	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
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
	  return this.name+"\t\t"+this.id+"\t\t"+this.marks+"\t\t"+phone;
  }
}
