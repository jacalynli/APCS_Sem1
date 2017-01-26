import java.util.Scanner;

public class CarDriver
{
		
       //Main():
       public static void main(String[]args)
	   
	   {
		//take 4 inputs for properties of your car.
       Scanner keyboard = new Scanner(System.in);
	   
	   System.out.println("Enter paint:");
	   String paint = keyboard.nextLine();
	   
	   System.out.println("Enter interior:");
	   String interior = keyboard.nextLine();
	   
	   System.out.println("Enter engine:");
	   String engine = keyboard.nextLine();
	   
	   System.out.println("Enter tires:");
	   String tires = keyboard.nextLine();
	   
	   //instantiate a new Car object, put in parameters, and
	   
	   Car object = new Car(paint, interior, engine, tires);
	   
       //print out the information on your car. You should get similar results to the following....
  
		System.out.println("Your vehicle is ready......");
		System.out.println("Paint: \t" + object.getPaint());
		System.out.println("Interior: \t" + object.getInterior());
  		System.out.println("Engine: \t" + object.getEngine());
		System.out.println("Tire: \t" + object.getTires());
  
  
       /*Your vehicle is ready......
       Paint:     red w/gold fleck
       Interior:   Corinthian leather (Brown)
       Engine:        5 litre v8 507hp
       Tires:     20" Priellis
		*/
	   }

}