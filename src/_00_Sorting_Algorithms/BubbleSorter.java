package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter {
	public BubbleSorter() {
		type = "Bubble";
	}

	// 1. Use the bubble sorting algorithm to sort the array.
	// You can use display.updateDisplay() to show the current
	// progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {

		while (_00_SortedArrayChecker.intArraySorted(array) == false) {
			for (int i = 1; i < array.length; i++) {
				display.updateDisplay();
				if (array[i] > array[i - 1]) {

				} else if (array[i] < array[i - 1]) {
					int check = array[i];
					array[i] = array[i - 1];
					array[i - 1] = check;

				}
			}

		}

	}
}
