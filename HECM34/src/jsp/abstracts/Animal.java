package jsp.abstracts;

public abstract class Animal {
	String food;

	public Animal(String food) 
	{
		this.food=food;
	}
	abstract public void eat();

}
