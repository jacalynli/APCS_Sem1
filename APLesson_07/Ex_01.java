import java.util.Scanner;
public class Ex_01
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int sum = 0;
		int number = keyboard.nextInt();
		int num = number;
		sumDigits(sum, num, number);
	}
	
	public static void sumDigits(int sum, int num, int number)
	{
		while (num > 0)
		{
			sum = sum + (num %10);
			num /= 10;
		}
		
		System.out.println("The sum of the digits in " + number + " is " + sum);
	}
}
