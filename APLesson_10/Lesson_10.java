import java.util.ArrayList;
import java.util.Arrays;
public class Lesson_10
{
	public static void main(String[]args)
	{
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<String> list2 = new ArrayList<String>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list2.add("a");
		list2.add("b");
		list2.add("c");
		
		System.out.println("List1 with numbers...\n" + list1);
		System.out.println("List2 with letters...\n" + list2);
		
		//ArrayList.size() Returns the length of the ArrayList
		System.out.println("Length of list1..." + list1.size()); 
		System.out.println("Length of list2..."+ list2.size());
		
		//ArrayList.get(x) returns the value at a given index x
		int number = list1.get(2);
		System.out.println("The location of 2 in the array is " + number);
		
		//ArrayList.set(x) overwrites the value at an index x with y
		list1.set(1, 8);
		System.out.println("The new list1 is " + list1);

		list2.set(2, "z");
		System.out.println("The new list2 is " + list2);
		
		//ArrayList.remove(x) deletes the value at position x from the list
		list1.remove(list1.indexOf(3));
		System.out.println(list1);

		list2.remove(list2.indexOf("a"));
		System.out.println(list2);
		
		//_______________________________________________________________________________________
		/*ArrayList.split(" ") parses the values from a String into an array,  
		ignoring the value in parentheses, called the delimiter
		Arrays.asList(array) converts the array to an Arraylist*/
		
		String letters = "a b c d e f g";
		String[] lets = letters.split(" ");
		
		Arrays.asList(lets);
		ArrayList<String> letterList = new ArrayList<String>(Arrays.asList(lets));
		System.out.println(letterList);
		
		//Arrays.toString() parses the Array in parentheses into a String
		System.out.println(Arrays.toString(lets));
		
		//_______________________________________________________________________________________
		//Integer.parseInt() converts numbers in a String to an integer
		String nums = "1 2 3 4 5 6 7 8 9";
		System.out.println(Integer.parseInt(nums.substring(4,5)));
		
		//split nums into an array
		String[] digits = nums.split(" ");
		
		//convert the numbers to ints and add them to an ArrayList
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for(int i = 0; i < digits.length; i++)
		{
		   numList.add(Integer.parseInt(digits[i]));
		}
		System.out.println(numList);
		
		//Add them all up
		int output = 0;
		for (int i=0; i<numList.size(); i++)
		{
		   output += numList.get(i);
		}

		System.out.println("The sum of the numbers is " + output);
	}
}