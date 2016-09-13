//import statement
import java.util.Scanner;

public class EX_02
{
	public static void main(String[]args)
	{
	//instantiate the new Scanner object "keyboard"
	Scanner keyboard = new Scanner(System.in);
	
	//Self-intro + ask name
	System.out.println("Hi, I'm a BMI calculator. What's your name?");
	
		//Search for the word the user enters
		String name = keyboard.next();
		
	//Ask for height in inches
	System.out.println("Hello " + name + ".  How tall are you (in inches)?");
		
		//Search for height value
		float height = keyboard.nextFloat();
		float heightValue = height * height;
		
	//Ask for weight in lb
	System.out.println("How much do you weigh (in lb)?");

		//Search for the weight value
		float weight = keyboard.nextFloat();
		
	//Conclusion
	System.out.println("Your BMI is " + 703 * weight/(heightValue) + ".");
		
	
	}
}