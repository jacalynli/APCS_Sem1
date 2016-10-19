import java.util.Scanner;

public class EX04
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your height: ");
		double h = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		System.out.println("Enter your weight: ");
		double w = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		double BMI = 703 * w / (h*h);
		
		String condition = calcBMI(BMI);
		
		System.out.println("Your BMI is " + BMI);
		System.out.println("You are " + condition + ".");
	}
	
	public static String calcBMI(double BMI)
	{
		if (BMI < 18.5)
		{
			return "underweight";
		}
		
		else if (BMI < 24.9)
		{
			return "normal";
		}
		
		else if (BMI < 29.9)
		{
			return "overweight";
		}
		
		else if (BMI < 34.9)
		{
			return "obese";
		}
		
		else if (BMI < 39.9)
		{
			return "very obese";
		}
		
		else if (BMI >= 39.9)
		{
			return "morbidly obese";
		}
		
		else
		{
			return "not available";
		}
	
	
	}
	
}