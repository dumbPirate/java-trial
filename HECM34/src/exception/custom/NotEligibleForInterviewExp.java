package exception.custom;

public class NotEligibleForInterviewExp extends Exception
{
	private String msg;
	public NotEligibleForInterviewExp(String msg)
	{
		this.msg=msg;
	}

	public String getMessage()
	{
		return msg;
	}

}
