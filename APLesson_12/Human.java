public class Human
{
	//Instance variables: hair, eyes, skin;
	private String hair, eyes, skin;
	 
	// Constructors...
	 
	// Both default 
	public Human()
	{
		hair = "";
		eyes = "";
		skin = "";
	}
	
	//and with parameters
	
	public Human(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	// Constructor @param(hair, eyes, skin)

	// Modifier: setHES @param(hair, eyes, skin)
	public void setHES(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}

	// Accessors...
	// return values for hair, eyes, and skin
	public String getHair()
	{
		return hair;
	}
	
	public String getEyes()
	{
		return eyes;
	}
	
	public String getSkin()
	{
		return skin;
	}
}
