public class PlayStation extends Console
{
	//constructors
	public PlayStation()
	{
		super();
	}
	
	public PlayStation(String p)
	{
		super(p);
	}
	
	//overrides
	public String getController()
	{
		return "PS DualShock 3";
	}
	
	public String getPlatform()
	{
		return "PlayStation";
	}
}