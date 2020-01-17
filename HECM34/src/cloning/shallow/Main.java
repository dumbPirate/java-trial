package cloning.shallow;

public class Main {
	public static void main(String[] args) 
	{
		
		try {
			Student s1=new Student("Birju",10,45.9);
			Student s2=(Student) s1.clone();
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s1==s2);
			
		} 
		catch (CloneNotSupportedException e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
