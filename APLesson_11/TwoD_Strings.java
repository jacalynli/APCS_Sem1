public class TwoD_Strings
{
	public static void main(String[]args)
	{
		String [][] randLetters = new String [4][4];
		
		//fill automatically
		String letters = "abcdefghijklmnopqrstuvwxyz";

		//nested for
		int spot = 0; //keeps track of where we are
		for(int i = 0; i < randLetters.length; i++)
		{
			for(int j = 0; j < randLetters[i].length; j++)
			{
				randLetters[j][i] = letters.substring(spot, spot + 1); //fill to change horizontal or vertical
				spot++;
			}
		}
				
		/*
		//fill manually
		randLetters[0][0] = "a";
		randLetters[1][1] = "b";
		randLetters[2][2] = "c";
		randLetters[3][3] = "d";
		*/
		
		
		for(int i = 0; i < randLetters.length; i++)
		{
			for(int j = 0; j < randLetters[i].length; j++)
			{
				System.out.print(randLetters[i][j] + "\t");
			}
			System.out.println();
		}	
	}
}