import java.util.*;

public class Toyota extends Car
{
	
	double coorx, coory;
	
	public Toyota(String location)
	{
		String[] coordinates = location.split(", ");
		coorx = Double.parseDouble(coordinates[0]);
		coory = Double.parseDouble(coordinates[1]);
	}
	
	public void move(double x, double y)
	{	
		coorx += x; 
		coory += y;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
	}
	
	public int getID()
	{
		return ID;
	}
	
	public double[] getLoc()
	{
		double[] loc = new double[2];
		loc[0] = coorx;
		loc[1] = coory;
		
		return loc;
	}
	
}