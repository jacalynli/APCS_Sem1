import java.util.Scanner;
public class Ex_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter 5 words: ");
		String [] words = new String[5];
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = keyboard.next();
		}
		
		first(words);
	}
	
	public static void first(String[] w)
	{
		for (String word : w)
		{
			System.out.println(word.substring(0,1));
		}
	}
}