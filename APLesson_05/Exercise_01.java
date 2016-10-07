//Import Random if you are planning to use it
import java.util.Random;

public class Exercise_01
{
	public static void main(String[]args)
	{
		//instantiate new random number
		Random rand = new Random();
		
		//Player rolls integer
		int numP = rand.nextInt(6)+1;
		System.out.println("You rolled a " + numP);
		
		//Computer rolls integer
		int numC = rand.nextInt(6)+1;
		System.out.println("Computer rolled a " + numC);
		
		boolean rollDice = true;
		if(rollDice(numP, numC))
		{
			System.out.println("Winner is you.");
		}
		
		if(!rollDice(numP, numC))
		{
			System.out.println("Winner is computer.");
		}
		
	}
	
	public static boolean rollDice(int numP, int numC)
	{
		return numP >= numC;
	}
}

