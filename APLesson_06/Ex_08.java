import java.util.Scanner;
public class Ex_08
{
	public static void main(String[]args)
	{
		String word1 = "Na";
		int num1 = 4;
		String word2 = "Hey";
		int num2 = 3;
		String word3 = "Goodbye!";
		int num3 = 1;
		
		song(word1, num1);
		song(word1, num1);
		song(word2, num2);
		song(word3, num3);
	}
	public static void song(String word, int number)
	{
		for(int i = number; i>0; i--)
		{
			System.out.printf(word + " ");
		}
		System.out.println("\n");
	}
}