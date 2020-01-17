package abstraction.practice2;

public class Artist {
	public static void main(String[] args)
	{
		
		FactoryProducer f=new FactoryProducer();
		AbstractFactory af	=f.getFactory("shape");	
		Shape s=af.getShape("rectangle");
		s.draw();
		
		af=f.getFactory("color");
		Color c=af.getColor("red");
		c.fill();
	}
}
