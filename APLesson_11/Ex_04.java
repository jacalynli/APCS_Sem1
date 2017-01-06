import java.util.Scanner;
public class Ex_04
{
	public static void main(String[]args)
	{
		// 1.Create a new 4 X 4, 2D int array called “nums”
		int[][] nums = new int [4][4];
		
		// 2. Fill and print the array in one loop
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				nums [i][j] = (int)(Math.random()*100);
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
		
		// 3. User prompt: “Please enter a number: ”
		
		System.out.println("Please enter a number: ");
		//4. Create a new int called “divisor” = user input
		
		Scanner keyboard = new Scanner (System.in);
		int divisor = keyboard.nextInt();
	

		//5. Create another new int called “count”, set = 0
		int count = 0;
		for (int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
				if (nums [i][j] % divisor == 0)
				{
					count++;
				}
		}
		
		System.out.println("There are " + count + " numbers divisible by " + divisor + " in the array.");
	}
}