package exception.watch;

public class Watch {
	private int hr,min,sec;

	public Watch(int hr,int min,int sec)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
	@Override
	public String toString()
	{
		return this.hr+":"+this.min+":"+this.sec;
	}
	public boolean equals(Object obj)
	{
		Watch w=(Watch)obj;
		return this.hr==w.hr && this.min==w.min && this.sec==w.sec;
	}
}
