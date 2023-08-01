package forPractice1;

import java.util.HashMap;
import java.util.Map;

import org.apache.poi.common.Duplicatable;

public class duplicatesUsingHashmap {
	public static void main(String[] args) {
		int x[] = { 2, 10, 10, 100, 2, 10, 11, 2, 11, 2 };
		Map<Integer, Integer> Duplicates = new HashMap<>();
		for (Integer i : x) {
			if (Duplicates.containsKey(i)) {
				int count = Duplicates.get(i);
				Duplicates.put(i, count + 1);
			} else {
				Duplicates.put(i, 1);
			}
		}
		System.out.println("Duplicate elements in the array:");
		for (Map.Entry<Integer, Integer> entry : Duplicates.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}
}
