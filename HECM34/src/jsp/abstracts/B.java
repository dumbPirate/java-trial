package jsp.abstracts;

public abstract class B extends A 
{
	public double y=10.22;
	public abstract void print(int a,int b);
	public void print() 
	{
		System.out.println(" No argument print");
	}
}
