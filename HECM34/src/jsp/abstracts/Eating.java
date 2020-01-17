package jsp.abstracts;

import java.util.Scanner;

public class Eating 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter your choice\n1.Dog\n2.Monkey\n3.Lion\n4.Exit");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:System.out.println("Enter the food for Dog");
				String f=sc.next();
			new Dog(f).eat();
			break;
		case 2:System.out.println("Enter the food for Monkey");
			String g=sc.next();
			new Monkey(g).eat();
			break;
		case 3:System.out.println("Enter the food for Leion");
			String h=sc.next();
			new Lion(h).eat();
			break;
		case 4:
			System.exit(0);
		default:System.out.println("Invalid Choice");
		}
		}
	}

}
