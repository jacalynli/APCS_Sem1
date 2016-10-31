import java.util.Scanner;

public class Ex_05
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What number would you like to count to?");
		int end = keyboard.nextInt();
		System.out.println("What number would you like to count by?");
		int interval = keyboard.nextInt();
		for (int i = 0; i <= end/interval; i++)
		{
			int print = i*interval;
			System.out.printf(print + "\t");
		}
	}
}