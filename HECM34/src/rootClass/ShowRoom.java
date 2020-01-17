//Array of objects
package rootClass;

import java.util.Scanner;

public class ShowRoom 
{
	public Cars[] read()
	{
		Cars[] c=new Cars[5];
		String name,color;
		double price;
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < c.length; i++) {
			System.out.println("Enter the name");
			name=sc.nextLine();

			System.out.println("Enter the color");
			color=sc.nextLine();
			
			System.out.println("Enter the price");
			price=sc.nextDouble();
			sc.nextLine();
			
			c[i]=new Cars(name,color,price);
		}
		sc.close();
		return c;
	}
	public void display(Cars[] c)
	{
		System.out.println("Name\t\tColor\t\tPrice");
		System.out.println("--------------------------------------");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
	}
	public void onlyRed(Cars[] c)
	{
		System.out.println("Name\t\tColor\t\tPrice");
		System.out.println("--------------------------------------");
		for (int i = 0; i < c.length; i++) {
			if(c[i].getColor().equalsIgnoreCase("Red"))
				System.out.println(c[i]);
		}
	}
	public void RedwithPrice20l(Cars[] c)
	{
		System.out.println("Name\t\tColor\t\tPrice");
		System.out.println("--------------------------------------");
		for (int i = 0; i < c.length; i++) {
			if(c[i].getColor().equals("Red")&& c[i].getPrice()>2000000.0)
				System.out.println(c[i]);
		}
		
	}
	public void HighestPrice(Cars[] c)
	{
		System.out.println("Name\t\tColor\t\tPrice");
		System.out.println("--------------------------------------");
		double high=c[0].getPrice();
		for (int i = 0; i < c.length; i++) {
			if(c[i].getPrice()>high)
				high=c[i].getPrice();
		}
		for (int i = 0; i < c.length; i++) {
			if(c[i].getPrice()==high)
				System.out.println(c[i]);;
		}	
	}
}

