package wrapper;

public class Wrapper1 {
	public static void main(String[] args) {
		Integer i1=10;
		Double d1=10.11;
		System.out.println(i1);
		System.out.println(d1);
		
		String s="100";
		int x=Integer.parseInt(s);
		
		int y=20;
		String s1=((Integer)y).toString();
		System.out.println(s1);
	}

}
