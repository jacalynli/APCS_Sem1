//import statement
import java.util.Scanner;

public class Cube
{
	public static void main(String[]args)
	{
		Cube total = new Cube();
		
		//instantiate the new Scanner object "Keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//ask for user inputs
		System.out.println("What is the length of a side of the cube?");
		
		//save the result
		double side = keyboard.nextDouble();
		
		print(calcSurf(side), side);
	}
	
	public static double calcSurf(double side)
	{
		return 6*(Math.pow(side, 2));
	}
	
	public static void print(double sa, double side)
	{
		System.out.printf("The surface area of a cube whose sides are " + side + " in lenght is %.5f", sa);
	}
}