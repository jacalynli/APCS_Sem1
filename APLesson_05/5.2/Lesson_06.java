//import statement 
import java.util.Scanner;

public class Lesson_06
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		String username = "TP";
		String password = "falcons";
		passCheck(username, password);

	}
	
	public static void passCheck(String username, String password)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your username:");
		String U = keyboard.nextLine();
		System.out.println("Enter your password:");
		String P = keyboard.nextLine();

		
		if (U.equals(username))
		{
			if (P.equals(password))
			{
				System.out.println("You are granted access!");
			}
			else
			{
				System.out.println("Your password is incorrect!");
			}
		}
		else
		{
			if (P.equals(password))
			{
				System.out.print("Your username is incorrect!");
			}
			else
			{
				System.out.println("Your username and password are incorrect!");
			}
		}
	}
}