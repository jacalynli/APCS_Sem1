import java.util.Scanner;

public class Ex_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = keyboard.nextInt();
		int factorial = 1;
		for(int i = 1; i <= number; i++)
		{
			factorial = factorial*i;
		}
		System.out.println(factorial);
	}
}