public class Ex_05
{
	public static int[] numbers = new int[10];
	
	public static void main(String[]args)
	{	
		fillArray();
		System.out.print("For the following numbers...");
		printArray();
		System.out.println("There are " + getOdds() + " odd numbers");
	}
	
	public static void fillArray()
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
	}
	
	public static void printArray()
	{
		for(int num : numbers)
		{
			System.out.print(num + " ");
		}
	}
	
	public static int getOdds()
	{
		int odds = 0;
		for(int num : numbers)
		{
			if(num % 2 == 1)
			{
				odds = 1 + odds;
			}
		}
		return odds;
	}
	
}