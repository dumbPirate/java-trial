package exception.watch;

public class MainJ {
	public static void main(String[] args) {
		Juice j1=new Juice("Orange",20);
		Juice j2=new Juice("Orange",10);
		
		System.out.println(j1);
		System.out.println(j2);
		if(j1.equals(j2))
		{
			System.out.println("The juice is same");
		}
		else
			System.out.println("The juice is different");
	}
}
