package exception.custom;

import java.util.Scanner;

public class Main1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Mock Done?");
		String c=sc.next();
		ValidateCriteria v=new ValidateCriteria();
		v.mock(c);
	}
}
