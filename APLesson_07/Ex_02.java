import java.util.Scanner;
public class Ex_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int number = keyboard.nextInt();
		int digits = 0;
		double average = 0;
		avDigits(number, digits, average);
	}
	
	public static void avDigits(int number, int digits, double average)
	{
		int num = number; 
		while(num > 0)
		{
			digits++;
			average = average + (num %10);
			num /= 10;
		}
		average = average/digits;
		System.out.println("The average of the digits in " + number + " is " + average);
	}
}