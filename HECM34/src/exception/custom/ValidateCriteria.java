package exception.custom;

public class ValidateCriteria {
	public void mock(String c)
	{
		if(c.charAt(0)=='Y'||c.charAt(0)=='y')
		{
			System.out.println("Eligible");
		}
		else
		{
			try
			{
			throw new NotEligibleForInterviewExp("Give mock first");
			}
			catch(Exception e)
			{
					System.out.println(e.getMessage());
			}
		}
	}
}
