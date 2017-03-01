import java.lang.Math;
import java.util.Scanner;

public class Toyota implements Location
{
	Scanner keyboard = new Scanner(System.in);
	
	String location;
	
	public Toyota()
	{
		location = "";
	}
	
	public Toyota(String location)
	{
		System.out.println("Enter your location in the form (x, y)");
		String location = keyboard.nextLine();
		ArrayList<double> coordinates = new ArrayList<double>(Arrays.asList(location.split(", ")));
	}
	
	public int getID()
	{
		return (int)(Math.random() * 100000 + 1);
	}
	
}