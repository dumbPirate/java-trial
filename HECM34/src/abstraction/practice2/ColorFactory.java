package abstraction.practice2;

public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shape) {
		return null;
	}

	@Override
	public Color getColor(String color) {
		Color c=null;
		if(color.equalsIgnoreCase("red"))
			c=new Red();
		else if(color.equalsIgnoreCase("green"))
			c=new Green();
		else
			c=new Blue();
		return c;
	}

}
