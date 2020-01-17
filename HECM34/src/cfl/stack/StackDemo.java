/*
 * To check whether the string is balanced or not
 * 
 */
package cfl.stack;

import java.util.*;
public class StackDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		Stack<String> st=new Stack<String>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='(')
				st.push(String.valueOf(s.charAt(i)));
			else if(s.charAt(i)=='}'&&!st.empty()||
					s.charAt(i)==']'&&!st.empty()||
					s.charAt(i)==')'&&!st.empty())
				st.pop();
			else if(s.charAt(i)=='}'&&st.empty()||
					s.charAt(i)==']'&&st.empty()||
					s.charAt(i)==')'&&st.empty())
			{
				System.out.println("Not Balanced");
				return;
			}
		}
		System.out.println(st);
		
	}
}
