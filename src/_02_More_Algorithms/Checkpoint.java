package _02_More_Algorithms;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Checkpoint {
	public static void main(String[] args) {
		Double[] unsorted = { 5d, 6d, 3d, 8d, 4d };
		Double[] sorted = { 3d, 4d, 5d, 6d, 8d };
		takeIn(unsorted);
		System.out.println(unsorted[0]);
		assertArrayEquals(sorted, unsorted);
		int[] contain = { 1, 2, 3, 4, 5, 6 };
		int containee = 1;
		int NotContainee = 9;
		assertTrue(Ints(contain, containee));
		assertFalse(Ints(contain, NotContainee));
		String [] unnsorted = {"ggg" , "ccc", "bbb" ,"fff", "ddd", "eee", "aaa"};
		String [] ssorted  = {"aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg"};
		sorter(unnsorted);
		assertArrayEquals(ssorted, unnsorted);
	}

	public static void takeIn(Double[] num) {
		for (int i = 0; i < num.length - 1; i++) {
			for (int k = i + 1; k < num.length; k++) {
				if (num[i] > num[k]) {
					Double first = num[k];
					num[k] = num[i];
					num[i] = first;
				}
			}
		}

	}

	public static boolean Ints(int[] ints, int numb) {
		boolean ans = false;
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] == numb) {
				ans = true;
			}
		}
		return ans;
	}

	public static String[] sorter(String[] words) {
		for (int i = 0; i < words.length - 1; i++) {
			for (int k = i + 1; k < words.length; k++) {
				if(words[i].compareTo(words[k])>=1) {
					String first  = words[i];
					words[i]=words[k];
					words[k] = first;
				}
			}
		}
		return words;
	}
}
