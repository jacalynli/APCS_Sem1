//Import Random if you are planning to use it
import java.util.Random;

public class Exercise_01
{
	public static void main(String[]args)
	{
		//instantiate new random number
		Random rand = new Random();
	}
}

main() method
Set the player roll integer to a random number between 1 and 6
Set the computer roll integer to a random number between 1 and 6


Set winner String to the output of rollDice()


Print “You rolled a <your roll>”
Print “Computer rolled a <computer’s roll>”
Print “The winner is <winner>”


rollDice() method
If you roll higher than the computer
    Winner is you 
If computer rolls higher
    Winner is computer


Return winner