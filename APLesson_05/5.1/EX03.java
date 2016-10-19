//import statement
import java.util.Scanner;

public class EX01
{
	public static void main(String[]args)
	{
		//instantiate new Scannner called "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your grade in math?");
		
			String math = keyboard.nextLine();
		
		System.out.println("What is your grade in science?");
		
			String science = keyboard.nextLine();
		
		System.out.println("What is your grade in history?");
		
			String history = keyboard.nextLine();
		
		System.out.println("What is your grade in P.E.?");
		
			String PE = keyboard.nextLine();
			
		System.out.println("What is your grade in English?");
		
			String English = keyboard.nextLine();
		
		System.out.println("What is your grade in Foreign language?");
			
			String language = keyboard.nextLine();
			
		System.out.println("What is your grade in Comp Sci?");
		
			String compSci = keyboard.nextLine();
		
		
		double gPoints = (calcPoints(math) + calcPoints(science) + calcPoints(history) + calcPoints(PE) + calcPoints(English) + calcPoints(language) + calcPoints(compSci))/7;
		
		
		System.out.println("Your GPA is " + gPoints);
	}
	
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
		{
			return 4.0;
		}
		
		else if (grade.equals("B"))
		{
			return 3.0;
		}
		
		else if (grade.equals("C"))
		{	
		return 2.0;
		}
		
		else if (grade.equals("D"))
		{
			return 1.0;
		}
		
		else
		{
			return 0;
		}
	}
}