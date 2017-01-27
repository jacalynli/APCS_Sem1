import java.util.Scanner;

public class InventoryRunner
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the item name:");
		String name = keyboard.nextLine();
		
		System.out.println("Enter the item manufacturer:");
		String manufacturer = keyboard.nextLine();
		
		Inventory invntry;
		
		System.out.println("Would you like to enter category and price information? (y or n)");
		String Inventory1 = keyboard.nextLine();
		
		if (Inventory1.equals("n"))
		{
			invntry = new Inventory(name, manufacturer);
			System.out.println(invntry);
		}
		
		else
		{
			System.out.println("Please enter a category:");
			String category = keyboard.nextLine();
			
			System.out.println("Please enter a price:");
			String price = keyboard.nextLine();
			
			invntry = new Inventory(name, manufacturer, category, price);
			System.out.println(invntry);
		}
		
		
		
	}
} 

/* 
Declare an Inventory object “item1”
Ask the user if he or she will be entering category and price information. 
 If the user answers “n”
  Initialize item1 - Use the first constructor
 If the user answers “y”
  Take user input for category and price
  Initialize item1 - Use the second constructor

        Print the object using toString()
		
*/