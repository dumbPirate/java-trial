package abstraction.practice2;

public class ShapeFactory extends AbstractFactory {

	public Shape getShape(String shape) {
		Shape s=null;
		if(shape.equalsIgnoreCase("Square"))
			s=new Square();
		else if(shape.equalsIgnoreCase("rectangle"))
			s=new Rectangle();
		else
			s=new Circle();
		return s;

	}

	@Override
	public Color getColor(String color) {
		return null;
	}

}
