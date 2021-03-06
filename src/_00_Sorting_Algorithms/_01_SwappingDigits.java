package _00_Sorting_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _01_SwappingDigits {

	@Test
	void test() {
		int[] x = {5, 6};
		int[] y = {6, 5};
		swapArrayOfTwo(x);
		assertArrayEquals(y, x);
		
		int[] z = {7, 3, 5, 9, 2};
		int[] q = {2, 3, 5, 7, 9};
		sortIntArray(z);
		assertArrayEquals(q, z);
		
		int[] m = {7, 3, 9, 5, 2};
		assertEquals(5, findMiddle(m));
	}
	
	//1. Complete the method so that the first two elements of the array are swapped
	public static void swapArrayOfTwo(int[] arr) {
		int temp = arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = temp;
	}
	
	//2. Complete the method so that it sorts the array using a bubble sort.
	//   Iterate through the array and when you find two elements that are out
	//   of order, swap them. Repeat this until the array is in order.
	public static void sortIntArray(int[] arr) {
		int temp;
		for(int i = 0; i < arr.length - 1; i ++)
		{
		for(int j = 0; j < arr.length - i - 1; j ++)
		{
			if(arr[j] > arr[j+1])
			{
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
			System.out.println(i);
			System.out.println(j);
			System.out.println("\n");
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]);
			System.out.println(arr[4]);
			System.out.println("\n");

		}
		}
	}

	
	//3. Complete the method so that it finds the middle number in the array.
	//   *Hint* it helps to sort it first.
	//   *Double Hint* Use the method you already wrote in step 2 to sort it
	public static int findMiddle(int[] arr) {
		sortIntArray(arr);
		return arr[arr.length/2];
	}
}
