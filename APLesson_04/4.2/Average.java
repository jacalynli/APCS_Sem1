//import scanner
import java.util.Scanner;

public class Average
{
	static double num1;
	static double num2;
	static double num3;
	static double avg;
	
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//user inputs for num1
		System.out.println("What is the value of the first number?");
		
			//save the result
			num1 = keyboard.nextDouble();
		
		//user inputs for num2
		System.out.println("What is the value of the second number?");
		
			//save the result
			num2 = keyboard.nextDouble();
		
		//user inputs for num3
		System.out.println("What is the value of the third number?");
			
			//save the result
			num3 = keyboard.nextDouble();
			
		//call average
		average();
		print();
		
	}
	
	public static void average()
	{
		avg = ((num1 + num2 + num3)/3);
	}
	
	
	public static void print()
	{
		System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is " + avg + ".");
	}
	
}