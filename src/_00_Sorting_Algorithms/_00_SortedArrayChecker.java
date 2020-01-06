package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise

	static boolean intArraySorted(int i[])
	{
		for(int j = 0; j < i.length - 1; j ++)
		{
			if(i[j] > i[j+1])
			{
				return false;
			}
		}
		return true;
		
	}
	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise

	static boolean doubleArraySorted(double d[])
	{
		for(int i = 0; i < d.length - 1; i ++)
		{
			if(d[i] > d[i+1])
			{
				return false;
			}
		}
		return true;
	}
	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)

	static boolean charArraySorted(char c[])
	{
		for(int i = 0; i < c.length - 1; i ++)
		{
			if(c[i] > c[i + 1])
			{
				return false;
			}
		}
		return true;
	}
	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)

	static boolean stringArraySorted(String s[])
	{
		for(int i = 0; i < s.length - 1; i ++)
		{
			if(s[i].charAt(0) > s[i+1].charAt(0))
			{
				return false;
			}
		}
		return true;
	}
	
}
