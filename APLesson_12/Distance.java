import java.lang.Math.*;
public class Distance
{
   //declare instance variables…
   private int xOne, yOne, xTwo, yTwo; 
   private double distance;

   //constructor....
   public Distance()
   {
	   xOne = 0;
	   yOne = 0;
	   xTwo = 0;
	   yTwo = 0;
	   distance = 0;
   }

   //constructor(parameters for xOne, yOne, xTwo, yTwo)
   public Distance(int xO, int yO, int xT, int yT)
   {xOne = xO;
	   yOne = yO;
	   xTwo = xT;
	   yTwo = yT;
	   distance = 0;
   }
   //Modifier: setValues()
   public void setValues()
   {
	   
   }
       //reset coordinates of the two points


   //Accessor: getDist()
		public double getDist()
		{
			distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
			return distance;
			
		}
       //calculates and returns the distance between two points
       //distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
}