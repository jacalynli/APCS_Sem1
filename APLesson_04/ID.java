//import statement
import java.util.Scanner;

public class ID
{
	public static void main(String[]args)
	{
	//instantiate the new Scanner object "keyboard"
	Scanner keyboard = new Scanner(System.in);
	
	//First Name
	System.out.println("Enter your first name:");
	
		//Save what the user enters
		String fName = keyboard.nextLine();
		
	//Last Name
	System.out.println("Enter your first name:");
	
		//Save what the user enters
		String lName = keyboard.nextLine();
		
	//Title
	System.out.println("Enter your title:");
	
		//Save what the user enters
		String title = keyboard.nextLine();
		
	//School
	System.out.println("Enter the school site:");
	
		//Save what the user enters
		String school = keyboard.nextLine();
		
	//School year
	System.out.println("Enter the school year:");
	
		//Save what the user enters
		String year = keyboard.nextLine();
			
	//Subject
	System.out.println("What is your subject?");
	
		//Save what the user enters
		String subject = keyboard.nextLine();
		
	System.out.println("**************************************");
	System.out.printf("* %15s  %17s *", school, year);
	System.out.printf("\n* %15s  %17s *", fName, lName);
	System.out.printf("\n* %15s  %17s *", title, subject);
	System.out.println("\n**************************************");
	}
}