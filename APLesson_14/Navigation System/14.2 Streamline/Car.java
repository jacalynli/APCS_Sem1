public abstract class Car implements Location
{
	public int ID;
	double coorx, coory;
	
	public Car()
	{
		ID = (int)(Math.random() * 100000 + 1);
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