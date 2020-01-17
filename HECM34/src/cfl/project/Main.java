package cfl.project;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		Studentdb sdb=new Studentdb(sc);
		while(true)
		{
			System.out.println("1.Add\n2.Display\n3.Search\n4.Remove\n5.Update\n6.Sort\n7.Exit");
			System.out.println("Enter your choice");
			System.out.println("-----------------");
			int ch=sc.nextInt();
			
			switch (ch) {
			case 1: sdb.addStudent();
				break;
			case 2:sdb.dispStudent();
				break;
			case 3:sdb.searchStudent();
				break;
			case 4:sdb.removeStudent();
				break;
			case 5:sdb.updateStudent();
				break;
			case 6:sdb.sortStudent();
				break;
			case 7:System.out.println("Exited from db");
				System.exit(0);
				break;
			default: System.out.println("Wrong choice. Enter again.");
				break;
			}
		}
	}
}
