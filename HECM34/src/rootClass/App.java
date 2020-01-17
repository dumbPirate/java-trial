package rootClass;

public class App {
	public static void main(String[] args) {
		ShowRoom sr=new ShowRoom();
		
		Cars[] c=sr.read();
		
		sr.display(c);
		System.out.println();
		System.out.println();
	}

}
