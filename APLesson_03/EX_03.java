//import statement
import java.util.Scanner;
public class EX_03
{
	public static void main(String[]args)
	{
	//instaniate the new Scanner object "keyboard"
	Scanner keyboard = new Scanner(System.in);
	
	//Self-intro and prompt for user input
	System.out.println("Hello! I convert from fahrenheit to celsius. What temperature would you like to convert?");
	
	//Search for the number that user enters
	int f = keyboard.nextInt();
	
	//Print the result
	System.out.println(f + " in celsius is " + ((f - 32) * 5 / 9) + ".");
	}
}