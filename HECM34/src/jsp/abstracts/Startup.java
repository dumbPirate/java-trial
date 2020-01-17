package jsp.abstracts;

import java.util.Scanner;

public class Startup 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter your choice\n1.Chrome\n2.Edge\n3.Brave\n4.DuckDuckGo\n5.Exit");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:new Chrome().start();
					break;
			case 2: new Edge().start();
					break;
			case 3: new Brave().start();
					break;
			case 4: new Duckgo().start();
					break;
			case 5:System.exit(0);
			
			default:System.out.println("Invalid choice..Enter again");
			}
		}
	}	
}
