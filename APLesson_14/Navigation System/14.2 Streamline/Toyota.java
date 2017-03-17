import java.util.*;

public class Toyota extends Car
{
	public Toyota(String location)
	{
		String[] coordinates = location.split(", ");
		coorx = Double.parseDouble(coordinates[0]);
		coory = Double.parseDouble(coordinates[1]);
	}
}