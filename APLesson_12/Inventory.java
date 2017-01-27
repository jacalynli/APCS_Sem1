import java.lang.Math;
public class Inventory
{
//Create the following instance variables: 
//Item Manufacturer
//Item name
//Item category (type of product: what section in the store?)
//9-digit UPC# (generate randomly)
//Item price
	private String manufacturer, name, category, price;
	private int UPC;


/*Inventory personnel in your company take in these items
 and add them to the system with name, and manufacturer. 
 However, the company may want to give the  sales manager 
 control over item category and price. Create the following 
 2 constructors:
*/
 
	 public Inventory()
	 {
		 manufacturer = "";
		 name = "";
		 category = "";
		 UPC = 0;
		 price = "";
	 }

	//Constructor 1
	//Takes parameters for manufacturer, and name (UPC is a random 9-digit number. 

	 public Inventory(String n, String m)
	 {
		 manufacturer = m;
		 name = n;
		 category = "N/A";
		 UPC = (int)(Math.random()*1000000000 + 1);
		 price = "N/A";
	 }
	 
	//Constructor 2
	//Takes all the parameters from Constructor 1, plus item category and price. 

	public Inventory(String n, String m, String c, String p)
	{
		 manufacturer = m;
		 name = n;
		 category = c;
		 UPC = (int)(Math.random()*1000000000 + 1);
		 price = p;
	}

	public String toString()
	{
		return "Item info....\nName: " + name +
							"\nManufacturer: " + manufacturer +
							"\nCategory: " + category +
							"\nUPC#: " + UPC +
							"\nprice: " + price;
	}

	
}
