//import statment
import java.util.Scanner;

public class Circle
{
	public static void main(String[]args)
	{
		Circle total = new Circle();
		
		//instantiate the new Scanner object "Keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//ask for inputs
		System.out.println("What is the radius of the circle?");
		
		//save the result
		double r = keyboard.nextDouble();
		
		print(calcArea(r), r);
	}
	
	public static double calcArea(double r)
	{
		return 3.14*(Math.pow(r, 2));
	}
	
	public static void print(double area, double r)
	{
		System.out.printf("The area of a circle with a radius of " + r + " is %.5f", area);
	}
}