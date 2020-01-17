package jsp.abstracts;

public class Lion extends Animal
{
	public Lion(String food) 
	{
		super(food);
	}
	public void eat()
	{
		System.out.println("Lion eats "+food);
		
	}

}
