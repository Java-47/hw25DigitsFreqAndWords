package telram.map.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class DigitsFreqAppl {
	private static final int N_NUMBER = 1_000_000;
	private static Random random = new Random();

	public static void main(String[] args) {

		Map<Integer, Integer> NumberFrequency = new HashMap<>();

		for (int i = 0; i < N_NUMBER; i++) {
			int randomNumber = Math.abs(random.nextInt());
			int temp;
			while (randomNumber != 0) {
				temp = randomNumber % 10;
				NumberFrequency.merge(temp, 1, (a, b) -> a + b);
				randomNumber /= 10;
			}
		}
		
		Set<Map.Entry<Integer, Integer>> entries = NumberFrequency.entrySet();
		for (Map.Entry<Integer, Integer> entry : entries) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

}
