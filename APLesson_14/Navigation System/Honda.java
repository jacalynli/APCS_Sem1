import java.util.*;

public class Honda implements Location
{
	double[] honLoc = new double[2];
	double coorx, coory;
	
	public Honda()
	{
		coorx = 0;
		coory = 0;
	}
	
	public Honda(double coorx, double coory, double[] honLoc)
	{
		coorx = honLoc[0];
		coory = honLoc[1];
	}
	
	public int getID()
	{
		return (int)(Math.random() * 100000 + 1);
	}
	
	public void move(double x, double y)
	{	
		coorx += x; 
		coory += y;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
	}
	
	public double[] getLoc()
	{
		double[] loc = new double[2];
		loc = honLoc;
		
		return loc;
	}
}