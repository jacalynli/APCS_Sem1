//import statement
import java.util.Scanner;

public class Reciept
{
	public static void main(String[]args)
	{
	//instantiate the new Scanner object "keyboard"
	Scanner keyboard =  new Scanner(System.in);
	
	//First item
	System.out.println("Please enter item 1:");
		
		//Save what the user enters
		String item1 = keyboard.nextLine();
	
	//Price of item1
	System.out.println("Please enter the price:");
		
		//Save what the user enters
		Float cost1 = keyboard.nextFloat();
		
		//eat return character 
		keyboard.nextLine();
	
	//Second item
	System.out.println("Please enter item 2:");
		
		//Save what the user enters
		String item2 = keyboard.nextLine();
		
	//Price of item2
	System.out.println("Please enter the price:");
		
		//Save what the user enters
		Float cost2 = keyboard.nextFloat();
		
		//eat return character 
		keyboard.nextLine();
		
	//Third item
	System.out.println("Please enter item 3:");
		
		//Save what the user enters
		String item3 = keyboard.nextLine();
		
	//Price of item3
	System.out.println("Please enter the price:");
		
		//Save what the user enters
		Float cost3 = keyboard.nextFloat();
		
		//eat return character 
		keyboard.nextLine();
			
	float Subtotal = cost1 + cost2 + cost3;
	float Tax = Subtotal*.08f;
	float Total = Subtotal + Tax;
	
	System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
	format(item1, cost1);
	format(item2, cost2);
	format(item3, cost3);
	format("Subtotal:", Subtotal);
	format("Tax:", Tax);
	format("Total:", Total);
	System.out.printf("\n______________________________________________");
	System.out.println(" \n* Thank you for your support *");
	}
	
	public static void format(String one, double two)
	{
		System.out.printf("\n* %15s.........%15.2f", one, two);
	}
}