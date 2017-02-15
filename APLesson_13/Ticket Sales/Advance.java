public class Advance extends Ticket
{
	int daysLeft;
	
	public Advance()
	{
		daysLeft = 0;
	}
	
	public Advance(int d)
	{
		daysLeft = d;
	}
	
	public double getPrice()
	{
		if (daysLeft >= 10)
		{
			return 30.00;
		}
		else
		{
			return 40.00;
		}
		
	}
	
}