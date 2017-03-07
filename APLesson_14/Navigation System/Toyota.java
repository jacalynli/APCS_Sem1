import java.util.*;

public class Toyota implements Location
{
	Scanner keyboard = new Scanner(System.in);
	
	String location;
	double coorx, coory;
	
	public Toyota()
	{
		location = "";
	}
	
	public Toyota(String location)
	{
		System.out.println("Enter your location in the form (x, y)");
		location = keyboard.nextLine();
		ArrayList<String> coordinates = new ArrayList<String>(Arrays.asList(location.split(", ")));
		coorx = Double.parseDouble(coordinates.get(0));
		coory = Double.parseDouble(coordinates.get(1));
	}
	
	public void move(double x, double y)
	{	
		coorx += x; 
		coory += y;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
	}
	
	public int getID()
	{
		return (int)(Math.random() * 100000 + 1);
	}
	
	public double[] getLoc()
	{
		double[] loc = new double[2];
		loc[0] = coorx;
		loc[1] = coory;
		
		return loc;
	}
	
}