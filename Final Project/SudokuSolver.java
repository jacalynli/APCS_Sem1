public class SudokuSolver
{
	public static void main(String[]args)
	{
		int[][] board = new int[9][9];
		
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < board[i].length -1; j++)
			{	
				else
				board[i][j] = (int)((Math.random()* 9) + 1); 
			}
		}
		
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < board[i].length; j++)
			{
				System.out.print(board[i][j] + "\t");
			}
			System.out.println();
		}
	}
}