package jsp.abstracts;

public class MainClass {

	public static void main(String[] args) 
	{
		D d=new D();
		d.print();
		d.print(10);
		d.print(10,20);
		System.out.println("x: "+d.x);
		System.out.println("y: "+d.y);
		System.out.println("z: "+d.z);

	}

}
