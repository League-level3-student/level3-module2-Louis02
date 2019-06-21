package _02_More_Algorithms;

import java.util.List;

import _00_Sorting_Algorithms._00_SortedArrayChecker;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int ans = -1;
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				ans = i;
				break;
			}
		}
		return ans;
	}

	public static int countPearls(List<Boolean> oysters) {
		int ans = -1;
		int counter = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				counter++;
				ans = counter;
			}
		}

		return ans;
	}

	public static Double findTallest(List<Double> peeps) {
		Double ans = -1d;
		Double tallest = peeps.get(0);
		for (int i = 0; i < peeps.size(); i++) {

			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);

			}
			ans = tallest;
		}

		return ans;
	}

	public static String findLongestWord(List<String> words) {
		String ans = "";
		int longest = words.get(0).length();
		String word = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longest) {
				longest = words.get(i).length();
				word = words.get(i);
			}
			ans = word;
		}
		return ans;
	}

	public static Boolean containsSOS(List<String> message2) {
		Boolean ans = null;
		String SOS = "... --- ...";
		Boolean result = false;
		for (int i = 0; i < message2.size(); i++) {
			if (message2.get(i).contains(SOS)) {
				result = true;
			}
			ans = result;
		}
		return ans;
	}

	public static List<Double> sortScores(List<Double> results) {

		for (int i = 0; i < results.size() - 1; i++) {
			for (int j = i + 1; j < results.size(); j++) {
				if (results.get(i) > results.get(j)) {
					double first = results.get(i);
					results.set(i, results.get(j));
					results.set(j, first);
				}
			}

		}
		return results;
	}

	public static List<String> sortDNA(List<String> sortedSequences) {
		for (int i = 0; i < sortedSequences.size() - 1; i++) {
			for (int j = i + 1; j < sortedSequences.size(); j++) {
				if (sortedSequences.get(i).length() > sortedSequences.get(j).length()) {
					String first = sortedSequences.get(i);
					sortedSequences.set(i, sortedSequences.get(j));
					sortedSequences.set(j, first);
				}
			}
		}

		return sortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		for (int i = 0; i < words.size() - 1; i++) {
			for (int j = i + 1; j < words.size(); j++) {
				if (words.get(i).compareTo(words.get(j)) >= 1) {
					String first = words.get(i);
					words.set(i, words.get(j));
					words.set(j, first);
				}

			}

		}
		return words;
	}
}
