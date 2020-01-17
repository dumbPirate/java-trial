package abstraction;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.print("Enter your choice:\n1.Chrome\n2.Opera\n3.Mozilla\n4.Exit\n");
			int ch=sc.nextInt();
			System.out.println("--------------");
			switch (ch) {
			case 1:new BrowserFactory().getBrowser(new Chrome());
			System.out.println("--------------");
				
				break;
			case 2:new BrowserFactory().getBrowser(new Opera());
			System.out.println("--------------");
			
			break;
			case 3:new BrowserFactory().getBrowser(new Mozilla());
			System.out.println("--------------");
			
			break;
			case 4:System.exit(0);
			
			default:System.out.println("Invalid Choice");
			System.out.println("--------------");
			}
			
		}
		
	}

}
