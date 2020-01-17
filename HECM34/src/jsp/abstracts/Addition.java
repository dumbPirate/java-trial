package jsp.abstracts;

public class Addition extends Calc {

	public Addition(int x, int y) 
	{
		super(x,y);
	}
	protected void add() 
	{
		System.out.println("Sum is "+(x+y));
	}

}
