//import statement
import java.util.Scanner;

public class Circle
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//User input for r
		System.out.println("What is the radius of the circle?");
		
		//Save user input
		r = keyboard.nextDouble();
	
		calcArea();
		print();
	}
	
	public static void calcArea()
	{
		area = 3.14 * (Math.pow(r, 2));
	}
	
	public static void print()
	{
		System.out.printf("The area of a circle with a radius of" + r + "is %.5f", area);
	}
}