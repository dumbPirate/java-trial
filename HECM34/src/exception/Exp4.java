package exception;

public class Exp4 {
	public static void main(String[] args) {
		
		try {
			badm();
			System.out.println("A");
		} 
		catch (Exception e) {
			System.out.println("B");
		}
		finally
		{
			System.out.println("C");
		}
		System.out.println("D");
	}

	public static void badm() {
		
	}
}
