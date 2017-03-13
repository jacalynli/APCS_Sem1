import java.util.*;

public class Honda extends Car
{
	
	double coorx, coory;
	
		
	public Honda(double[] honLoc)
	{
		coorx = honLoc[0];
		coory = honLoc[1];
	}
	
	public int getID()
	{
		return ID;
	}
	
	public void move(double x, double y)
	{	
		coorx += x; 
		coory += y;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
	}
	
	public double[] getLoc()
	{
		double[] loc = new double[2];
		loc[0] = coorx;
		loc[1] = coory;
		
		return loc;
	}
}