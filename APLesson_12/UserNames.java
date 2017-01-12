public class UserNames
{
	//instance variables
	private String userName, firstName, lastName;
	
	//Default Constructor
	public UserNames()
	{
		//default values for instance vars
		userName = "";
		firstName = "";
		lastName = "";
	}
	
	//Constructor with params
	public UserNames(String uName, String fName, String lName)
	{
		//overloading..
		userName = uName;
		firstName = fName;
		lastName = lName;
	}
	
	//Modifiers, the username will change but first and last names won't
	public void setUserName(String uName)
	{
		userName = uName;
	}
	
	//Accessors, allows access (reading), but can't change
	public String getUserName()
	{
		return userName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	
}