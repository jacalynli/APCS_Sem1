//import statement
import java.util.Scanner;

public class Average 
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "Keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//ask for user inputs
		System.out.println("What is number 1?");
		
			//save the result
			double num1 = keyboard.nextDouble();
		
		//ask for user inputs
		System.out.println("What is number 2?");
		
			//save the result
			double num2 = keyboard.nextDouble();
			
		//ask for user inputs
		System.out.println("What is number 3?");
		
			//save the result
			double num3 = keyboard.nextDouble();
			
		print(average(num1, num2, num3), num1, num2, num3);
	}
	
	public static double average (double num1, double num2, double num3)
	{
		return (num1 + num2 + num3)/3;
	}
	
	public static void print(double Average, double num1, double num2, double num3)
	{
		System.out.printf("The average of " + num1 + ", " + num2 + ", and " + num3 + "is %.5f", Average);
	}
	
}