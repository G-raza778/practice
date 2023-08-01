package forPractice1;

import java.util.HashMap;
import java.util.Map;

public class newCountCharr {
	public static void main(String[] args) {
		String s = "stringjava";
		char[] ch = s.toCharArray();
		Map<Character, Integer> countMap = new HashMap<>();
		for (Character c : ch) {
			if (countMap.containsKey(c))
			{
				int count = countMap.get(c);
				countMap.put(c, count + 1);
			}
			else
			{
				countMap.put(c, 1);
			}
		}
		System.out.println("count of the charecters in the string are:");
		for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
