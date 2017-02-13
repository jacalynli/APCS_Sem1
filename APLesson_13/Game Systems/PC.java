public class PC extends GameSystem
{
	//default constructor
	public PC()
	{
		super();
	}
	
	//constructor with parameters
	public PC(String p)
	{
		super(p);
	}
	
	public String getSystemInput()
	{
		return "Keyboard and Mouse";
	}
	

	
	public String toString()
	{
		return "Platform: " + super.getPlatform()
			+ "\nSerial #: " + super.getSerialNo()
			+ "\nSystem Input: " + getSystemInput();
	}
}