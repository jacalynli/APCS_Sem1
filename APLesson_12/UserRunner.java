import java.util.Scanner;

public class UserRunner
{
	public static void main(String[]args)
	{	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter first name:");
		String firstName = keyboard.nextLine();
		
		System.out.println("Enter last name:");
		String lastName = keyboard.nextLine();
		
		User pH;
		
		System.out.println("Would you like to use a public avatar? (y or n)");
		String user1 = keyboard.next();
		
		if (user1.equals("n"))
		{
			pH = new User(firstName, lastName);
			System.out.println(pH);
		}
		
		else
		{
			System.out.println("Please Enter a name for your avatar: ");
			String avatar = keyboard.next();
			pH = new User(firstName, lastName, avatar);
			System.out.println(pH);
		}
	

	}	

}


/*Add 2 sets of user inputs for your main(). Add user inputs for first and last name, then ask the user if he or she wants a public avatar, with a yes or no response. 
 
 

  Prompt: Would you like to use a public avatar? (y or n)

 Create an if condition:

  If customer chooses “n”
  initialize user1 with the first constructor
 If customer chooses “y”
  Take input for an avatar
  Initialize user1 with the second constructor

 Use the toString() to print out the user’s information like we saw above. */