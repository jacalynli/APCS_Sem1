//import statment
import java.util.Scanner;

public class lesson_03
{
	public static void main(String[]args)
	{
	//instantiate the new Scanner object "keyboard"
	Scanner keyboard = new Scanner(System.in);
	
	//prompt for user input
	System.out.println("How old are you? ");
	
	//Search for the integer that the user enters
	int num = keyboard.nextInt();
	
	//print the result...
	System.out.println("Wow! " + num + " is perfect. ");
	
	//prompt for user input
	System.out.println("Who is your favorite teacher?");
	
	//Search for the integer that the user enters
	String teacher = keyboard.next();
	
	//prompt for user input
	System.out.println("Okay! " + teacher + " is very good!");
	}
}
