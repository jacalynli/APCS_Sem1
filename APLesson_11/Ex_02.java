import java.util.Scanner;
public class Ex_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		// 1.Create a new 4 X 4
		String [][] words = new String[4][4];
		
		// 2. Fill the array with words with a 2D for loop
		for(int i = 0; i < words.length; i++)
		{
			for(int j = 0; j < words[i].length; j++)
			{
				System.out.println("Please enter a word:");
				words[i][j] = keyboard.nextLine();				
			}
		}
		
		// 3. Print the array with a 2D for loop
		for(int i = 0; i < words.length; i++)
		{
			for(int j = 0; j < words[i].length; j++)
			{
				System.out.print(words[i][j] + "\t");
			}
			System.out.println();
		}
	}
}