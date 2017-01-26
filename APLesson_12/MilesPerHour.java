import java.lang.Math.*;
public class MilesPerHour
{
   //instance variables....
   private int distance, hours, minutes;
   private double mph; 

   //default constructor
	public MilesPerHour()
	{
	distance = 0;
	hours = 0;
	minutes = 0;
	mph = 0;
	
	}

   //constructor with params
   public MilesPerHour(int d, int h, int m)
   {
	distance = d;
	hours = h;
	minutes = m;
	mph = 0;
   }

   //modifier 
   public void setValues(int d, int h, int m)
   {
	distance = d;
	hours = h;
	minutes = m;
	mph = 0;
   }

   //accessor: 
   public int getDistance()
   {
	return distance;   
   }
   
   public int getHours()
   {
	return hours;
   }
   
   public int getMinute()
   {
	return minutes;
   }
   
   public double getMPH(int distance, int hours, int minutes)
   {
	mph = Math.round(distance / (hours + minutes / 60.0));
	return mph;
   }   

  
}