package string;

public class Main1 {
	public static void main(String[] args) {
		ImmClass i1=new ImmClass(10);
		ImmClass i2=i1.modify(20);
		ImmClass i3=i1.modify(10);
		
		System.out.println(i1==i2);
		System.out.println(i1==i3);
	}

}
