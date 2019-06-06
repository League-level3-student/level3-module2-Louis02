package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD

	@Test
	public void testLinearSearch() {
		// 1. use the assertEquals method to test your linear search method.
		String[] words = { "Zero", "One", "Two", "Three" };

		assertEquals(2, _00_LinearSearch.linearSearch(words, "Two"));
		assertEquals(1, _00_LinearSearch.linearSearch(words, "One"));
		assertEquals(0, _00_LinearSearch.linearSearch(words, "Zero"));
	}

	@Test
	public void testBinarySearch() {
		// 2. use the assertEquals method to test your binary search method.
		// remember that the array must be sorted
		int[] nums = { 0, 1, 2, 3, 4 };
		assertEquals(0, _01_BinarySearch.binarySearch(nums, 0, 4, 0));
		assertEquals(1, _01_BinarySearch.binarySearch(nums, 0, 4, 1));
		assertEquals(2, _01_BinarySearch.binarySearch(nums, 0, 4, 2));
	}

	@Test
	public void testInterpolationSearch() {
		// 3. use the assertEquals method to test your interpolation search method.
		// remember that the array must be sorted and evenly distributed
		int[] value = { 0, 1, 2, 3, 4 };
		assertEquals(0, _02_InterpolationSearch.interpolationSearch(value, 0));
		assertEquals(1, _02_InterpolationSearch.interpolationSearch(value, 1));
		assertEquals(2, _02_InterpolationSearch.interpolationSearch(value, 2));

	}

	@Test
	public void testExponentialSearch() {
		// 4. use the assertEquals method to test your exponential search method.
		// remember that the array must be sorted
		int[] array = { 0, 1, 2, 3, 4 };
		assertEquals(0, _03_ExponentialSearch.exponentialSearch(array, 0));
		assertEquals(1, _03_ExponentialSearch.exponentialSearch(array, 1));
		assertEquals(2, _03_ExponentialSearch.exponentialSearch(array, 2));
	}
}
