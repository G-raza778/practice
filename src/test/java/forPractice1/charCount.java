package forPractice1;

import java.util.HashMap;
import java.util.Map;

public class charCount {
	public static void main(String[] args) {
		String s = "gulam ahmed raza";
		int count = 0;
		char[] ch = s.toCharArray();
		Map<Character, Integer> charCount = new HashMap<>();
		for (int i = 0; i < ch.length; i++) {
			count = 0;
			for (int j = 0; j < ch.length; j++) {
				if (ch[i]==ch[j]) {
					count++;
				}
			}
			
			charCount.put(ch[i], count);
		}
			System.out.println(charCount);
		}
		
	}

