package forPractice1;

import java.util.HashMap;

public class dupCharcUsingHashmap {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 2, 3, 5, 6, 5 };
		HashMap<Integer, Integer> frequencyMap = new HashMap<>();

		for (int num : arr) {
			if (frequencyMap.containsKey(num)) {
				frequencyMap.put(num, frequencyMap.get(num) + 1);
			} else {
				frequencyMap.put(num, 1);
			}
		}
		System.out.println("Duplicate elements:");
		for (int num : frequencyMap.keySet()) {
			if (frequencyMap.get(num) > 1) {
				System.out.println(num);
			}
		}
	}
}