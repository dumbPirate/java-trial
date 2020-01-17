package exception.custom;

public class NotEligibleForMarriage extends Exception
{
	private String msg;
	public NotEligibleForMarriage(String msg)
	{
		this.msg=msg;
	}

	public String getMessage()
	{
		return msg;
	}
}
