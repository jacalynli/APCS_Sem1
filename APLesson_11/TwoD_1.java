public class TwoD_1
{
	public static void main(String[]args)
	{
		//filling the array
			//declare 2D array
			int[][] values = new int [4][4]; //creates 4x4
			
			//add values to array (manually)
			values [0][0] = 1;
			values [1][1] = 2;
			values [2][2] = 3;
			values [3][3] = 4;		
		
		//printing the array
			//use nested for loop
			for(int i = 0; i < values.length; i++) //loops through rows
			{
				for(int j = 0; j < values[i].length; j++) //loops through each value in row
				{
					System.out.print(values[i][j]); //not println
				}
				System.out.println(); //prints extra line
			}
	}
}