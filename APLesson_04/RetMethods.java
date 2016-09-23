public class RetMethods
{
	public static void main(String[]args)
	{
		RetMethods volCube = new RetMethods();
		int side1 = 3;		
		System.out.println(volCube.cube(side1));
	}
	
	public int cube(int side)
	{
		return side*side*side;
	}
}