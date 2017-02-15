public class StudentAdvance extends Advance
{
	public StudentAdvance()
	{
		super();
	}
	
	public StudentAdvance(int d)
	{
		super(d);
	}
	
	public double getPrice()
	{
		if (daysLeft >= 10)
		{
			return 15.00;
		}
		else
		{
			return 20.00;
		}
	}
	
	public String toString()
	{
		return super.toString() + "\nSTUDENT ID REQUIRED";
	}
}