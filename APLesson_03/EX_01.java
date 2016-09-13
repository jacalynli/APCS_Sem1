//import statement
import java.util.Scanner;

public class EX_01
{
	public static void main(String[]args)
	{
	//instantiate the new Scannner object "keyboard"
	Scanner keyboard = new Scanner(System.in);
	
	//Self-intro
	System.out.println("Hi, my name is RudeAI.");
	System.out.println("I'd like to ask you a few questions.");
	
	//prompt for user input
	System.out.println("What is your name?");
	
		//Search for the word that the user enters
		String name = keyboard.next();
	
		//Print the result...
		System.out.println(name + "?!!! Why would anyone name a baby that?");
	
	//prompt for user input
	System.out.println("How old are you, " + name + "?");
		
		//Search for the integer that the user enters
		int age = keyboard.nextInt();
	
		//Print the result...
		System.out.println("Oooooo!!!" + age + " is getting up there.");
	
	//prompt for user input
	System.out.println("What do you do for fun, " + name + "?");
	
		//eat return character
		keyboard.nextLine();
		
		//Search for the words that the user enters
		String fun = keyboard.nextLine();
	
		//Print the result...
		System.out.println("I thought only nerds like to " + fun + ".");
		
	//prompt for user input
	System.out.println("What kind of music do you like?");
	
		//eat return character
		keyboard.nextLine();
		
		//Search for words that the user enters
		String music = keyboard.nextLine();
		
		//Print the result...
		System.out.println("Boooo!!! I wouldn't wish the sound of " + music + " on my worst enemy.");
	
	//prompt for user input
	System.out.println("How many siblings do you have?");
	
		//Search for the integer that the user enters
		int siblings = keyboard.nextInt();
		
		//Print the result
		System.out.println(siblings + "? Wow, I hope the rest of your family is better looking.");
	
	//prompt for user input
	System.out.println("What do you want to be when you grow up?");
	
		//eat return character
		keyboard.nextLine();
		
		//Search for the words that the user enters
		String career = keyboard.nextLine();
		
		//Print the result
		System.out.println("I think you'd have to be smarter to be a " + career + ".");
		
	//Conclusion
	System.out.println("So " + name + ", you're " + age + "...");
	System.out.println("You like to " + fun + " and listen to " + music + "...");
	System.out.println("Good luck becoming a " + career + ".");
	System.out.println("I'm only kiddin' " + name + ".");
	
	}
}