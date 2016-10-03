//import Scanner
import java.util.Scanner;

public class Cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//user input for side
		System.out.println("What is the length of the side of the cube?");
		
		//Save the variable
		side = keyboard.nextDouble();
		
		calcSurf();
		print();
	}
	
	public static void calcSurf()
	{
		sa = 6*(Math.pow(side, 2));
	}
	
	public static void print()
	{
		System.out.printf("The surface area of a cube whose sides are " + side + "in length is %.5f.", sa);
	}
}