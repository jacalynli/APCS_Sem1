public class Lesson_04
{
	public static void main(String[]args)
	{
		Lesson_04 form = new Lesson_04();
		
		System.out.printf("%10s   %10.2f", "test", 44444564.3453);
		System.out.printf("\n%10s   %10.2f", "thisexam", 909878.00);
		System.out.printf("\n%15.2f", 44444564.345344);
		System.out.printf("\n%d", 44444564);
		System.out.printf("\n%s", "hi");
		String word1 = "blaaah";
		double number1 = 4444564.3453;
		
		form.format(word1, number1);
		
		String word2 = "yesssss";
		double number2 = 567456.7685674;
		form.format(word2,number2);
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n%10s   %10.2f", word, number);
	}
}