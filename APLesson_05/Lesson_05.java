import java.util.Random;

public class Lesson_05
{
	public static void main(String[]args)
	{
		int num = 5;
		if(num == 3)
		{
			System.out.println("num equals 3!");
		}
		
		if(num == 5)
		{
			System.out.println("num equals 5!");
		}
		
		boolean tOrF = true;
		
		if(tOrF())
		{
			System.out.println("It is true!");
		}
		
		if(!tOrF())
		{
			System.out.println("It is false!");
		}
		
		int number = (int) (1 + Math.random()*3);
		System.out.println(number);
		
		//instantiate new random object
		Random rand = new Random ();
		int num1 = rand.nextInt(4);
		System.out.println(num1);
	}
	
	public static boolean tOrF()
	{
		return 8 >= 5;
		
	}
}