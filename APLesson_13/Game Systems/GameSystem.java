import java.lang.Math;
public abstract class GameSystem
{
	String platform;
	int serialNo;
	
	//default constructor
	public GameSystem()
	{
		this.platform = "";
		this.serialNo = (int)(Math.random()*10000000 + 1);
	}
	
	//constructor with parameters
	public GameSystem(String p)
	{
		this.platform = p;
		this.serialNo = (int)(Math.random()*10000000 + 1);
	}
	
	
	//accessors
	public String getPlatform()
	{
		return platform;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	
	
}