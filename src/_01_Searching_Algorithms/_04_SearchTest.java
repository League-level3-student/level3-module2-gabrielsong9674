package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	void testLinearSearch() {
		String array[] = {"hi", "hello", "hola"};
		
		assertEquals(0, _01_Searching_Algorithms._00_LinearSearch.linearSearch(array, "hi"));
		assertEquals(1, _01_Searching_Algorithms._00_LinearSearch.linearSearch(array, "hello"));
		assertEquals(2, _01_Searching_Algorithms._00_LinearSearch.linearSearch(array, "hola"));

	}

	@Test
	void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int array[] = {1, 2, 3, 4, 5, 6};
		assertEquals(0, _01_Searching_Algorithms._01_BinarySearch.binarySearch(array, 0, 5, 1));
		assertEquals(1, _01_Searching_Algorithms._01_BinarySearch.binarySearch(array, 0, 5, 2));
		assertEquals(2, _01_Searching_Algorithms._01_BinarySearch.binarySearch(array, 0, 5, 3));
	}
	
	@Test
	void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int array[] = {1, 2, 3, 4, 5};
		assertEquals(0, _01_Searching_Algorithms._02_InterpolationSearch.interpolationSearch(array, 1));
		assertEquals(1, _01_Searching_Algorithms._02_InterpolationSearch.interpolationSearch(array, 2));
		assertEquals(2, _01_Searching_Algorithms._02_InterpolationSearch.interpolationSearch(array, 3));

	}
	
	@Test
	void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int array[]= {1, 2, 3, 4, 5, 6};
		assertEquals(0, _01_Searching_Algorithms._03_ExponentialSearch.exponentialSearch(array, 1));
		assertEquals(1, _01_Searching_Algorithms._03_ExponentialSearch.exponentialSearch(array, 2));
		assertEquals(2, _01_Searching_Algorithms._03_ExponentialSearch.exponentialSearch(array, 3));
		
	}
}
