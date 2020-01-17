package jsp.abstracts;

public abstract class Calc {

	int x=20;
	int y;

	public Calc(int x,int y) 
	{
		this.x=x;
		this.y=y;
	}
	abstract void add();
}
