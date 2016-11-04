import java.util.Scanner;
public class Lesson_07
{
	static int number;
	static int digits = 0;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = kb.nextInt();
		countDigits();
		System.out.println(number + " has " + digits + " digits.");
		/*while(number > 0)
		{
			//prints the last digit on the right
			System.out.println(number % 10);
			//Dividing my 10 shaves off the last digit
			number /= 10;
		}*/
	}
	
	public static void countDigits()
	{
		int num = number;
		while(num > 0)
		{
			digits += 1;
			num /= 10;
		}
	}
}