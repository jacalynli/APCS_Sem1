import java.util.Scanner;
public class Lesson_06_1
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String word = "COMPSCI";
		System.out.println(word.length());
		//System.out.println(word.indexOf("S"));
		//System.out.println(word.indexOf("OMPS"));
		//System.out.println(word.substring(1,4));
		//System.out.println(word.substring(2));
		//System.out.println(word.charAt(2));
		
		//System.out.println("Please enter a word: ");
		//String word = keyboard.next();
		
		for(int i = 0; i <= word.length(); i++)
		{
			//System.out.println(word.charAt(i));
			System.out.println(word.substring(0,i));
			
		}
	}
}