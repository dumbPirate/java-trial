package abstraction.practice1;

import java.util.Scanner;
public class Artist {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.print("Enter your choice:\n1.Circle\n2.Square\n3.Rectangle\n4.Exit\n");
			int ch=sc.nextInt();
			System.out.println("--------------");
			switch (ch) 
			{
			case 1:new ShapeFactory().getShape("Circle").draw();
			System.out.println("--------------");
				
				break;
			case 2:new ShapeFactory().getShape("Square").draw();
			System.out.println("--------------");
			
			break;
			case 3:new ShapeFactory().getShape("Rectangle").draw();
			System.out.println("--------------");
			
			break;
			case 4:System.exit(0);
			
			default:System.out.println("Invalid Choice");
			System.out.println("--------------");
			}
		}
	}
}
