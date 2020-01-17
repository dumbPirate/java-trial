package cfl.arrayList;

import java.util.*;

public class ArrayListDemo4 {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		ArrayList l2 =null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter outer size");
		int size=sc.nextInt();
		for (int i = 0; i < size; i++) {
			l2=new ArrayList();
			System.out.println("Enter inner size");
			int size2=sc.nextInt();
			System.out.println("Enter the elements");
			for (int j = 0; j < size2; j++) {
				int a=sc.nextInt();
				l2.add(a);
			}
			l1.add(l2);
		}
		System.out.println(l1);
		System.out.println(l1.get(1));
	}
}
