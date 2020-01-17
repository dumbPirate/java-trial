package exception.custom;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the gender");
		String c=sc.next();
		System.out.println("Enter the age");
		int age=sc.nextInt();
		ValidateAge v=new ValidateAge();
		v.age(c, age);
	}
}
