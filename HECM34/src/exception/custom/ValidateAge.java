package exception.custom;

public class ValidateAge 
{
	public void age(String c,int age)
	{
		if(c.charAt(0)=='m' && age>=21 ||c.charAt(0)=='f' && age>=18)
		{
			System.out.println("Enjoy");
		}
		else
		{
			try
			{
			throw new NotEligibleForMarriage("Grow up first idiot");
			}
			catch(Exception e)
			{
					System.out.println(e.getMessage());
			}
		}
	}
}
