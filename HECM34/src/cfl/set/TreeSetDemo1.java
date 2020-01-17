package cfl.set;
import java.util.*;
public class TreeSetDemo1 {
	public static void main(String[] args) {
		NavigableSet<Character> t=new TreeSet<Character>();
		
		t.add('a');
		t.add('z');
		t.add('w');
		t.add('q');
		t.add('e');
		t.add('t');
		t.add('g');
		
		System.out.println(t);
	}
}
