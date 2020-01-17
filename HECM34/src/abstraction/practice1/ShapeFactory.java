package abstraction.practice1;

public class ShapeFactory {
	public Shape getShape(String type)
	{
		Shape s=null;
		if(type.equals("Circle"))
			s=new Circle();
		else if(type.equals("Square"))
			s=new Square();
		else
			s=new Rectangle();
		
		return s;
	}

}
