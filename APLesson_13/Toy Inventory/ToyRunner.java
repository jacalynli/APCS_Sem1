import java.util.Scanner;
public class ToyRunner
{	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner (System.in);
		
		//Car
		Car ride = new Car("Ferrari");
		System.out.println(ride);
		
		//AFigure
		AFigure figure = new AFigure("Star Wars");
		System.out.println(figure);
	}
}