package exception;

public class Exp2 {
	public static void main(String[] args) {
		
		try {
			badm();
			System.out.println("A");
		} 
		catch(RuntimeException ex)
		{
			System.out.println("B");
		}
		catch (Exception e) {
			System.out.println("C");
		}
		finally
		{
			System.out.println("D");
		}
		System.out.println("E");
	}

	public static void badm() {
		throw new RuntimeException();
	}
}
