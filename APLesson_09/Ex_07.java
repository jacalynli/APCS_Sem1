import java.util.Scanner;
public class Ex_07
{
	public static String[] words = new String[5];;
	public static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		
		fillArray();
		System.out.print("For the words ");
		printArray();
		System.out.println("\nOnly" + hasZs() + " contain(s) the letter z");
	}
	
	public static void fillArray()
	{
		System.out.println("Enter 5 words: ");
		for(int i = 0; i < words.length; i++)
		{
			words[i] = keyboard.next();
		}
	}
	
	public static void printArray()
	{
		for(String word : words)
		{
			System.out.print("\"" + word + ",\"" + " ");
		}
	}
	
	public static String hasZs()
	{
		String zs = "";
		for (String word : words)
		{
			if (word.indexOf("z") >= 0)
			{
				zs = zs + " " + "\"" + word +"\""; 
			}
		}
		
		return zs; 
	}
	
}