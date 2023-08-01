package forPractice1;

import java.util.HashMap;
import java.util.Map;

public class dupCharacterInString {
	public static void main(String[] args) {
		String str = "Hello World";
		Map<Character, Integer> countMap = new HashMap<>();

		char[] charArray = str.toCharArray();
		for (char ch : charArray) {
			if (Character.isAlphabetic(ch)) {
				if (countMap.containsKey(ch)) {
					int count = countMap.get(ch);
					countMap.put(ch, count + 1);
				} else {
					countMap.put(ch, 1);
				}
			}
		}

		System.out.println("Duplicate characters in the string:");
		for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}
}