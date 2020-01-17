package string;

final class ImmClass {
	final int x;
	ImmClass(int x)
	{
		this.x=x;
	}
	public ImmClass modify(int x)
	{
		if(this.x!=x)
			return new ImmClass(x);
		else 
			return this;
	}
}
