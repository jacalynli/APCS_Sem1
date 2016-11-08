import java.util.Scanner;
public class Ex_03
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int number = keyboard.nextInt();
		int num = number;
		int reverse = 0;
		getReverse(number, num, reverse);
	}
	
	public static void getReverse(int number, int num, int reverse)
	{
		while(num > 0)
		{
			reverse *= 10;
			reverse = reverse + (num %10);
			num /= 10;
		}
		System.out.println(number + " reversed is " + reverse);
	}
}