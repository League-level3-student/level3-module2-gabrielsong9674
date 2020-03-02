package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0; i < eggs.size(); i ++)
		{
			if(eggs.get(i) == "cracked")
			{
				return i;
			}
		}
		return 0;
	}
	
	public static int countPearls(List<Boolean> oysters)
	{
		int counter = 0;
		for(int i = 0; i < oysters.size(); i ++)
		{
			if(oysters.get(i) == true)
			{
				counter++;
			}
		}
		return counter;
	}
	
	public static double findTallest(List<Double> peeps)
	{
		double tallest = 0;
		for(int i = 0; i < peeps.size(); i ++)
		{
			if(peeps.get(i) > tallest)
			{
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}
	
	public static String findLongestWord(List<String> words)
	{
		String longest = " ";
		int length = 0;
		for(int i = 0; i < words.size() - 1; i ++)
		{
			if(words.get(i).length() > length)
			{
				longest = words.get(i);
				length = words.get(i).length();
				
			}
		}
		return longest;
	}
	
	public static boolean containsSOS(List<String> message)
	{
		String SOS = " ... --- ...";
		for(int i = 0; i < message.size(); i ++)
		{
			System.out.println(message.get(i));
			System.out.println(SOS);
		}
		return false;
		
	}
}
