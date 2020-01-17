package abstraction.practice2;

public class FactoryProducer {
	public AbstractFactory getFactory(String type)
	{
		if(type.equalsIgnoreCase("shape"))
			return new ShapeFactory();
		else
			return new ColorFactory();
	}

}
