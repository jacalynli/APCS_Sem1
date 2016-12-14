public class TwoD_FillLoop
{
	public static void main(String[]args)
	{
		//filling the array
			//declare 2D array
			int[][] values = new int [4][4]; //creates 4x4
	
			/* fill automatically (horizontally) by nested for loop
			//declare num
			int num = 1; 
			for(int i = 0; i < values.length; i++)
			{
				for(int j = 0; j < values[i].length; j++)
				{
					values[i][j] = num;
					num++;
				}
			}*/
			
			//interate from top to bottom (fill automatically (vertically))
			int num = 1;
			for(int i = 0; i < values.length; i++)
			{
				for(int j = 0; j < values[i].length; j++) //controls columns
				{
					values[j][i] = num; //switch these because j is faster
					num++;
				}
				//num++; //only moves to next row after the inside for loop finishes
			}
			
		
		//printing the array
			//use nested for loop
			for(int i = 0; i < values.length; i++) //talks about the whole array
			{
				for(int j = 0; j < values[i].length; j++) //talks about a single array (one row)
				{
					System.out.print(values[i][j] + "\t"); //not println
				}
				System.out.println(); //prints extra line
			}
			
		//search the array
		int count = 0; 
		for(int i = 0; i < values.length; i++)
		{
			for (int j = 0; j < values[i].length; j++)
			{
				if(values[i][j] % 5 == 0) //if multiple of 5, add 1 to count
				{
					count++;
				}
			}
		}
		System.out.println("There are " + count + " multiples of 5 in the array.");
		
	}
}