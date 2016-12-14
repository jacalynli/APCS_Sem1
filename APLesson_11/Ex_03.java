public class Ex_03
{
	public static void main(String[]args)
	{
		// 1. Create new 4 X 4, 2D Array called “xAndO”
		String [][] xAndO = new String[4][4];
		
		// 2. Fill the array with xs and os at random
		for(int i = 0; i < xAndO.length; i++)
		{
			for(int j = 0; j < xAndO[i].length; j++)
			{
				int pick = (int)((Math.random()*2) + 1);
				if (pick == 1)
				{
					xAndO[i][j] = "x";
				}
				if (pick == 2)
				{
					xAndO[i][j] = "o";
				}
				System.out.print(xAndO[i][j] + "\t");
			}
			System.out.println();
		}
	}
}