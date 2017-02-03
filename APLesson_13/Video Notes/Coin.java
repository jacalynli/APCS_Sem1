public class Coin extends Money
{
	private double value;
	private String name, weight;
	
	public Coin()
	{
		super(); //calls stuff in Money
		this.weight = ""; //"this" comes from current object
	}
	
	public Coin(String n, String w, double v)
	{
		super(n, v);
		this.weight = "";
	}	
	
	public String scan()
	{
		return weight;
	}
	
	public String toString()
	{
		return "Weight: " + weight + "g\n" +
				super.toString();
	}
}