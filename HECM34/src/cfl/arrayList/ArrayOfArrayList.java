package cfl.arrayList;

import java.util.*;

public class ArrayOfArrayList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		ArrayList al[]=new ArrayList[size];
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the size of arrayList "+(i+1));
			int s=sc.nextInt();
			al[i]=new ArrayList(s);
			System.out.println("Enter the elements of arrayList");
			for (int j = 0; j < s; j++) {
				al[i].add(sc.nextInt());
			}
		}
		
		for (int i = 0; i < size; i++) {
			System.out.println("ArrayList "+(i+1)+" elements are");
			for (int j = 0; j < al[i].size(); j++) {
				System.out.print(al[i].get(j)+" ");
			}
			System.out.println();
		}
		
		System.out.println("Enter the index of array to be found");
		int index=sc.nextInt();
		System.out.println("Enter the index of arrayList");
		int indexAl=sc.nextInt();
		try {
			System.out.println("The element is "+al[index].get(indexAl));
		} catch (Exception e) {
			System.out.println("Error!!");
		}
	}
}