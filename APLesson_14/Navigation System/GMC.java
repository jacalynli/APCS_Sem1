import java.lang.Math;
import java.util.Scanner; 

public class GMC implements Location
{
	Scanner keyboard = new Scanner(System.in);
	
	double x, y;
	
	public GMC()
	{
		x = 0;
		y = 0;
	}
	
	public GMC(double x, double y)
	{
		System.out.println("Enter coordinate x:");
		x = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		System.out.println("Enter coordinate y:");
		y = keyboard.nextDouble();
	}
	
	public int getID()
	{
		return (int)(Math.random() * 100000 + 1);
	}
	
	public double[] getLoc()
	{
		double[] loc = new double[2];
		loc[0] = x;
		loc[1] = y;
		
		return loc;
	}
}