//import statement
import java.util.Scanner;

public class Ex_01
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your word:");
		String word = keyboard.nextLine();
		
		for(int number = word.length(); number >= 0; number--)
		{
			System.out.println(word);
		}
		
	}
}