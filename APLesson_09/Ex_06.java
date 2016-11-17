public class Ex_06
{
	public static int[] numbers = new int[10];
	
	public static void main(String[]args)
	{
		
		System.out.print("For the following numbers...");
		fillArray();
		printArray();
		System.out.println("\nThe biggest number is " + getBiggest());
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
	
	public static int getBiggest()
	{
		int max = 0;
		for(int num : numbers)
		{
			if (num >= max)
			{
				max = num;
			}
		}
		return max;
	}
}