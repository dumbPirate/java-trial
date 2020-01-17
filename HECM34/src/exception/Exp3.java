package exception;

public class Exp3 {
	public static void throwit() {
		System.out.println("throwit");
		throw new RuntimeException();
	}
	public static void main(String[] args) {
		
		try {
			System.out.println("Hellow");
			throwit();
		} 
		catch(Exception ex)
		{
			System.out.println("caught");
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println("after");
	}

	public static void badm() {
		throw new RuntimeException();
	}
}
