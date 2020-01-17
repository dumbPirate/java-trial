package string;

public class StringDemo {

	public static void main(String[] args) {
		String s="i love java i love python ilove ruby i love c#";
		
		String[] str=s.split("love");
		for (String ss:str) {
			System.out.println(ss);
		}
		System.out.println(str.length-1);
	}
}
