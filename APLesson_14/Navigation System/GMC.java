import java.lang.Math;
import java.util.Scanner; 

public class GMC implements Location
{
	Scanner keyboard = new Scanner(System.in);
	
	double coorx, coory;
	
	public GMC()
	{
		coorx = 0;
		coory = 0;
	}
	
	public GMC(double coorx, double coory)
	{
		System.out.println("Enter coordinate x:");
		coorx = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		System.out.println("Enter coordinate y:");
		coory = keyboard.nextDouble();
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
		loc[0] = coorx;
		loc[1] = coory;
		
		return loc;
	}
}