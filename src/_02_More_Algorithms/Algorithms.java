package _02_More_Algorithms;

import java.lang.reflect.Array;
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
		String SOS = " ... --- ... ";
		for(int i = 0; i < message.size(); i ++)
		{
			if(SOS.equals(message.get(i)))
			{
				return true;
			}
		}
		return false;
		
	}
	
	public static List<Double> sortScores(List<Double> results)
	{
		double temp;
		for(int i = 0; i < results.size() - 1; i ++)
		{
		for(int j = 0; j < results.size() - i - 1; j ++)
		{
			if(results.get(j) > results.get(j+1))
			{
				temp = results.get(j);
				results.set(j, results.get(j+1));
				results.set(j+1, temp);
			}
		}
	
		}
		return results;
	}
	
	public static List<String> sortDNA(List<String> sequence)
	{
		String temp;
		for(int i = 0; i < sequence.size(); i ++)
		{
			for(int j = 0; j < sequence.size()-i-1; j ++)
			{
				if(sequence.get(j).length() > sequence.get(j+1).length())
				{
					temp = sequence.get(j);
					sequence.set(j, sequence.get(j+1));
					sequence.set(j+1, temp);
				}
			}
		}
		System.out.println(sequence.get(0));
		return sequence;
	}
	
	public static List<String> sortWords(List<String> words)
	{
		
		return words;
	}
}
