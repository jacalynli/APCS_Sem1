import java.util.Scanner;
public class MPHRunner
{
   //main() method
	public static void main(String[]args)
	{
	    //create a Scanner object
	    Scanner keyboard = new Scanner(System.in);
		//get user inputs for distance, hours, and minutes
		System.out.println("Enter a distance:");
		int d = keyboard.nextInt();
	
		System.out.println("Enter a hours:");
		int h = keyboard.nextInt();
		
		System.out.println("Enter a minutes:");
		int m = keyboard.nextInt();
		
	   //instantiate a new MilesPerHour object
	   //@param distance, hours, and minutes
		MilesPerHour object = new MilesPerHour();

	   //print the info, formatted nicely....
	   
	   System.out.println(object.getDistance() + " miles in " + object.getHours()+ " hours and " + object.getMinute() + " minutes = " + object.getMPH() + " mph.");
	   
	   //make sure to use the accessors for the data
	   //EX: 10 miles in 2 hours = 5 mph

		object.setValues(200,0,30);
	   //run the modifier: setValues()
	   //set new distance, hours, and minutes

		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hours and " + object.getMinute() + " minutes = " + object.getMPH() + " mph.");
	   //print the info, formatted nicely....
	   //EX: 10 miles in 2 hours = 5 mph
	}
}