import java.util.Scanner;

public class Ex_04
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number of rows:");
		int rows = keyboard.nextInt();
		for(int i = 0; i <= rows; i++)
		{
			System.out.println(i + "\t" + i*rows);
		}
	}
}