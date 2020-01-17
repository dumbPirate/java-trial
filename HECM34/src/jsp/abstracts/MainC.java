package jsp.abstracts;

import java.util.Scanner;

public class MainC 
{
	public static void main(String[] args) 
	{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st number");
	int x= sc.nextInt();
	System.out.println("Enter 2nd number");
	int y=sc.nextInt();
	
	Addition a=new Addition(x,y);
	a.add();
	}
}
