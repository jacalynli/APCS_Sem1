//import scanner
import java.util.Scanner;

public class Rectangle
{
	static double l;
	static double w;
	static double perimeter;
	
	
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//user inputs for l 
		System.out.println("What is the value of l?");
		
		//Save the result
		 l = keyboard.nextDouble();
		
		//user inputs for w 
		System.out.println("What is the value of w?");
		
		//Save the result
		 w = keyboard.nextDouble();
		
		
		//call calcPerim()
		calcPerim();
		//call print()
		print();
	}
	
	public static void calcPerim()
	{
		perimeter = l * w;
	}
	
	public static void print()
	{
		//simple print statement
		System.out.println("Your rectangle is " + perimeter + "ft around."); 
	}
}