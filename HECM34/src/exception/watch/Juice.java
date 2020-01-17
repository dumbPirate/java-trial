package exception.watch;

public class Juice {
	private String juice;
	private int quant;

	public Juice(String juice,int quant)
	{
		this.juice=juice;
		this.quant=quant;
	}
	
	public String toString()
	{
		return this.juice+" type of "+this.quant+" lt" ;
	}
	public boolean equals(Object obj)
	{
		Juice j=(Juice)obj;
		return this.juice.equals(j.juice)&&this.quant==j.quant;
	}
}
