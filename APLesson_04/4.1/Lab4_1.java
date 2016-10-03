//import statement
import java.util.Scanner;

public class Lab4_1
{
	public static void main(String[]args)
	{
		Lab4_1 total = new Lab4_1();
		
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//Question
		System.out.println("How much do you intend to borrow?");
		
		//Save the result
		double p = keyboard.nextDouble();
		
		//eat return character
		keyboard.nextLine();
		
		//Question
		System.out.println("What is the interest rate?");
		
		//Save the result
		double r = keyboard.nextDouble();
		
		//eat return character
		keyboard.nextLine();
		
		//Question
		System.out.println("How many times is the loan compounded per year?");
		
		//Save the result
		double n = keyboard.nextDouble();
		
		//eat return character
		keyboard.nextLine();
		
		//Question
		System.out.println("How long is the life of the loan (in years)?");
		
		//Save the result
		double t = keyboard.nextDouble();
		
		//eat return character
		keyboard.nextLine();
		
		double totalPayment = total.payment(p, r, n, t);
		System.out.println(totalPayment);
		System.out.printf("Your monthly payment will be %.5f", totalPayment);
	}
	
	public double payment(double p, double r, double n, double t)
	{
		return (p*(Math.pow((1+(r/n)), (n*t))))/(12*t);
		///(t*12)p*
	}
	
}