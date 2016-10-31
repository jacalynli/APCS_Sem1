import java.util.Scanner;

public class Ex_06
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = keyboard.nextLine();
		int end = word.length();
		for (int i = 0; i <= word.length(); i++)
		{
			System.out.println(word.substring(i,end));
		}
	}
}