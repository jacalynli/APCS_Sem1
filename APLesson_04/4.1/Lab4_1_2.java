//import statement
import java.util.Scanner;

public class Lab4_1_2
{
	public static void main(String[]args)
	{
		//allows us to call methods
		Lab4_1_2 total = new Lab4_1_2();
		
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//Question 
		System.out.println("What is the height of the box in inches?");
		
		//Save the result
		double height = keyboard.nextDouble();
		
		//eat return character
		keyboard.nextLine();
		
		//Question 
		System.out.println("What is the length of the box?");
		
		//Save the result
		double length = keyboard.nextDouble();
		
		//eat return character
		keyboard.nextLine();
		
		//Question 
		System.out.println("What is the width of the box?");
		
		//Save the result
		double width = keyboard.nextDouble();
		
		//eat return character
		keyboard.nextLine();
		
		//calculate volume
		double volume = height*length*width;

		System.out.println("Volume = " + volume + " cubic inches");
		
		double volumeFeet = total.feet(volume);
		System.out.printf("Your volume in cubic feet is %10.2f", volumeFeet);
	}
	
	public double feet(double volume)
	{
		return (volume/1728);
	}
}