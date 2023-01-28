package telram.map.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordsFreqAppl {

	public static void main(String[] args) {
		String[] words = { "abc", "ab", "limn", "limn", "ab", "limn", "a" };
		displayWordsFrequency(words);

	}

	private static void displayWordsFrequency(String[] words) {
		Map<String, Integer> res = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			res.merge(words[i], 1, (a, b) -> a + b);

		}
		Set<Map.Entry<String, Integer>> entries = res.entrySet();
		System.out.println("===== Unsorted =====");
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		// HW
		System.out.println("===== Sorted =====");

		List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(res.entrySet());
		Collections.sort(sortedEntries, (e1, e2) -> e2.getValue().compareTo(e1.getValue()));
		for (Map.Entry<String, Integer> entry : sortedEntries) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());

		}

	}

}
