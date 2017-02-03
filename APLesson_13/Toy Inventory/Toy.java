public abstract class Toy
{
	private String name;
	private int count;

	//default constructor
	public Toy()
	{
		this.name = "";
		this.count = 0;
	}
	
	//constructor with parameters
	public Money(String n, int c)
	{
		this.name = n;
		this.value = v;
		this.count = 0;
	}
	
	public void setName(String n)
	{
		this.name = n;
	}
	
	public void setCount(String c)
	{
		this.count = c;
	}
	
	public String getName()
	{
		reutrn name;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public abstract String getType();
	
	public String toString()
	{
		return name + ", " + count;
	}
	
}
