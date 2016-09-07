public class Lab_02
{
	public static void main(String[]args)
	{
		//Multiplication
		int a;
		int b;
		a = 7;
		b = 5;
		System.out.println ("a multiplied by b is " + a * b);

		System.out.println("\n");
		
		//Concentenation
		String name = "Falcon X";
		int addressNumber = 3710;
		String addressName = "Del Mar Heights Road";
		String city = "San Diego";
		String state = "CA";
		int zip = 92130;
		System.out.println(name);
		System.out.println(addressNumber + " " + addressName);
		System.out.println(city + "," + " " + state + " " + zip);
		
		System.out.println("\n");
		
		//Complex Calculation
		int l = 8; 
		int w;
		int h;
		w = l;
		h = l;
		int recArea = (l * w) + (l * h) + (w * h);
		
		System.out.println ("The surface area of your cube is" + " " + 2*recArea);
	}
}