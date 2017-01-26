public class Car
{
	// set instance variables...
	// paint, interior, engine, tires
	private String paint, interior, engine, tires;
	
	
	public Car()
	{
		paint = "";
		interior = "";
		engine = "";
		tires = "";
	}

	// Constructor: @param (p, i, e, t)
	public Car(String color, String material, String number, String radius)
	{
		paint = color;
		interior = material;
		engine = number;
		tires = radius;
	}
	
	
   // Modifier: setCustom @param(p, i, e, t)
   public void setCustom(String color, String material, String number, String radius)
   {
	    paint = color;
		interior = material;
		engine = number;
		tires = radius;
   }
   
   // set instance variables...
       // paint, interior, engine, tires
	

   /** Accessors...    **/
   // getPaint(): return paint color
   public String getPaint()
   {
	   return paint;
   }
   
   // getInterior(): return interior type
   public String getInterior()
   {
	   return interior;
   }
   
   // getEngine(): return engine type
   public String getEngine()
   {
	   return engine;
   }
   
   // getTires(): return tires
   public String getTires()
   {
	   return tires;
   }
}