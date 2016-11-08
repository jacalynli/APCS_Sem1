import java.util.Scanner;
public class Ex_04
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a sentence:");
		String sentence = keyboard.nextLine();
		replace(sentence);
	}
	
	public static void replace(String sentence)
	{
		while(sentence.indexOf("a") >= 0)
		{
			sentence = sentence.substring(0, sentence.indexOf("a")) + "@" + sentence.substring(sentence.indexOf("a") + 1);
		}
		System.out.println(sentence);
	}
}