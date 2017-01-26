import java.util.Scanner;
public class DistanceRunner
{
   //main() method
   public static void main(String[]args)
   {
	   //create a Scanner object
	   Scanner keyboard = new Scanner (System.in);
	   //Take user input for x1, y1, x2, and y2
		System.out.println("Enter x1:");
		int x1 = keyboard.nextInt();
		
		System.out.println("Enter y1:");
		int y1 = keyboard.nextInt();

		System.out.println("Enter x2:");
		int x2 = keyboard.nextInt();

		System.out.println("Enter y2:");
		int y2 = keyboard.nextInt();

	   //new Distance object @param x1, y1, x2, y2
	   Distance object = new Distance(x1, y1, x2, y2);
	  
	   //print the distance with a label and number formatting
		//use accessors to retrieve the data
	   //EX: distance = 22.35
		System.out.println("distance = " + object.getDist());

	   //Call setValues() to set new coordinates
	   //print the distance just like before
   }
}