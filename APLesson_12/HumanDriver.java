import java.util.Scanner;
public class HumanDriver
{
   public static void main(String[]args)
   {
		// User inputs for hair, eyes, and skin
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter hair:");
		String hair = keyboard.nextLine();
		
		System.out.println("Enter eyes:");
		String eyes = keyboard.nextLine();
		
		System.out.println("Enter skin:");
		String skin = keyboard.nextLine();

		// Create a new Human object @ param (hair, eyes, skin)
		
		Human object = new Human(hair, eyes, skin);
		
		// Input your own hair, eye, and skin info...
		// print info about the human object
		// Example:
		// My info...
		// Hair: black
		// Eyes: green
		// Skin: tan
		
		System.out.println("My info...");
		System.out.println("Hair: " + object.getHair());
		System.out.println("Eyes:" + object.getEyes());
		System.out.println("Skin: " + object.getSkin());

		// Use modifier to plug in a friend's information
		
		object.setHES("blonde", "blue", "white");
		// @param(new hair, eyes, and skin values)
		// print info about your friend
		
		System.out.println("\nFriend's info...");
		System.out.println("Hair: " + object.getHair());
		System.out.println("Eyes:" + object.getEyes());
		System.out.println("Skin: " + object.getSkin());
		
		// Example:
		// Friend's info...
		// Hair: blonde
		// Eyes: blue
		// Skin: white
   }
    }