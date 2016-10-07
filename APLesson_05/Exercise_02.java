//Import Scanner
import java.util.Scanner;

public class Exercise_02
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//First item
		System.out.println("Please enter item 1:");
		
			//Save what the user enters
			String item1 = keyboard.nextLine();
			
			//Price
			System.out.println("Please enter the price:");
			double cost1 = keyboard.nextFloat();
			
			//eat return character
			keyboard.nextLine();
		
		//Second item
		System.out.println("Please enter item 1:");
		
			//Save what the user enters
			String item2 = keyboard.nextLine();
			
			//Price
			System.out.println("Please enter the price:");
			double cost2 = keyboard.nextFloat();
			
			//eat return character
			keyboard.nextLine();
			
		//Third item
		System.out.println("Please enter item 3:");
		
			//Save what the user enters
			String item3 = keyboard.nextLine();
			
			//Price
			System.out.println("Please enter the price:");
			double cost3 = keyboard.nextFloat();
			
			//eat return character
			keyboard.nextLine();
			
		//Fourth item
		System.out.println("Please enter item 4:");
		
			//Save what the user enters
			String item4 = keyboard.nextLine();
			
			//Price
			System.out.println("Please enter the price:");
			double cost4 = keyboard.nextFloat();
			
			//eat return character
			keyboard.nextLine();
		
		double Subtotal = cost1 + cost2 + cost3 + cost4;
		double Discount = discount(Subtotal);
		double Tax = Subtotal*.08;
		double Total = Subtotal - Discount + Tax;	
	
		format(Subtotal, Discount, Tax, Total, item1, cost1, item2, cost2, item3, cost3, item4, cost4);
	}
	
	public static double discount(double Subtotal)
	{
		
		if (Subtotal >= 2000)
		{
			return Subtotal*.15;
		}
		
		else
		{
			return 0;
		}
	}
	
	public static void format(double Subtotal, double Discount, double Tax, double Total, String item1, double cost1, String item2, double cost2, String item3, double cost3, String item4, double cost4)
	{
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		System.out.printf("\n*%16s ........%10.2f", item1, cost1);
		System.out.printf("\n*%16s ........%10.2f", item2, cost2);
		System.out.printf("\n*%16s ........%10.2f", item3, cost3);
		System.out.printf("\n*%16s ........%10.2f", item4, cost4);
		System.out.printf("\n\n*%16s ........%10.2f", "Subtotal:", Subtotal);
		System.out.printf("\n\n*%16s ........%10.2f", "Discount:", Discount);
		System.out.printf("\n*%16s ........%10.2f", "Tax:", Tax);
		System.out.printf("\n*%16s ........%10.2f", "Total:", Total);
		System.out.printf("\n\n______________________________________________");
		System.out.println(" \n* Thank you for your support *");
	}
}