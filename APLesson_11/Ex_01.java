public class Ex_01
{
	public static void main(String[]args)
	{
		// 1.Create a new 4 X 4
		int[][] nums = new int [4][4];
		
		// 2.Fill the array with random numbers
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = (int)((Math.random()* 51)); 
			}
		}
		
		// 3. Print the array
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				System.out.print(nums[i][j] + "\t"); 
			}
			System.out.println();
		}
	}
}