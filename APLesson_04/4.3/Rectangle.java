//import statement
import java.util.Scanner;

public class Rectangle
{
	public static void main(String[]args)
	{
		Rectangle total = new Rectangle();
		
		//instantiate the new Scanner object "Keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//Ask for length
		System.out.println("What is the length of the rectangle?");
		
		//Save the result
		double l = keyboard.nextDouble();
		
		//Ask for width
		System.out.println("What is the width of the rectangle?");
		
		//Save the result
		double w = keyboard.nextDouble();
		
		print(calcPerim(l, w));
	}
	
	public static double calcPerim(double l, double w)
	{
		return (2*l) + (2*w);
	}
	
	public static void print(double perimeter)
	{
		System.out.printf("Your rectangle is %.5f ft around.", perimeter);
	}
}