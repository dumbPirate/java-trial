package string;

public class Immutable {
	public static void main(String[] args) {
		String s="hello";
		String s1=s.concat(" World");
		System.out.println(s);
		System.out.println(s1);
		
		StringBuilder s2=new StringBuilder("Hello");
		s2.append(" World");
		System.out.println(s2);
		
		String s3=s2.toString();
		StringBuffer s4=new StringBuffer(s3);
		System.out.println(s4);
	}

}
