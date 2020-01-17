package exception.watch;

public class MainC {
	public static void main(String[] args) {
		Watch w1=new Watch(10,20,30);
		Watch w2=new Watch(10,30,30);
		System.out.println(w1);
		System.out.println(w2);
		
		if(w1.equals(w2))
			System.out.println("The time is same");
		else
			System.out.println("The time is different");
	}

}
