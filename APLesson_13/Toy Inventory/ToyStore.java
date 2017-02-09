import java.util.*;
import java.util.Scanner;

public class ToyStore
{
	public ArrayList<Toy> toyList = new ArrayList<Toy> ();
	
	// Constructors:
	// One default 
	public ToyStore()
	{
		this("");
	}

	// and one with a String parameter, which is a list of toys. 
	// The constructor runs the loadToys() method below with the input list as a parameter.

	public ToyStore(String input)
	{
		this.loadToys(input);
	}

	// The loadToys() Method
	// Takes in a String which is a list of “toys”, and uses a for loop to check if each toy is in the list. 
	public void loadToys(String ts) // @param ts
	{
	// ArrayList of Strings - use ts.split(“, “). Call it “toys”. 
	ArrayList<String> list = new ArrayList<String>(Arrays.asList(ts.split(", ")));
	
	for(int i = 0; i < list.size(); i += 2)
	{
		String name = list.get(i);
		String type = list.get(i + 1);
		Toy object = getThatToy(name);
		
		if(object == null)
		{
			if(type.equals("Car"))
			{
				toyList.add(new Car(name));
			}
			if(type.equals("AF"))
			{
				toyList.add(new AFigure(name));
			}
		}
		else
		{
			object.setCount(object.getCount() + 1);
		}
	}
	}

	public Toy getThatToy (String nm)
	{
		for(Toy toy : toyList)
		{
			if(toy.getName().equals(nm))
				return toy;
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(Toy toy: toyList)
		{
			if(max < toy.getCount())
			{
				max = toy.getCount();
				name = toy.getName();
			}
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for(Toy toy : toyList)
		{
			if(toy.getType().equalsIgnoreCase("car"))
			{
				cars++;
			}
			if(toy.getType().equalsIgnoreCase("af"))
			{
				figures++;
			}
		}
		if(cars > figures)
		{
			return "Cars";
		}
		if(figures > cars)
		{
			return "Action Figures";
		}
		else 
		{
			return "Equal amounts of action figures and cars!";
		}
	}
	
	public String toString()
	{
		return "" + toyList;
	}
}