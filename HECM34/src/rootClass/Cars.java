package rootClass;

public class Cars {
	private String name,color;
	private double price;

	public Cars(String name,String color,double price)
	{
		this.name=name;
		this.color=color;
		this.price=price;
	}
	public String getname()
	{
		return this.name;
	}
	public String getColor()
	{
		return this.color;
	}
	public double getPrice()
	{
		return this.price;
	}
	
	public String toString()
	{
		return this.name+"\t\t"+this.color+"\t\t"+this.price;
	}
}
