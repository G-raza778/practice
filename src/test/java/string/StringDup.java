package string;

import java.util.HashMap;
import java.util.Map;


public class StringDup {
public static void main(String[] args) {
	String s="hello world";
	Map<Character, Integer>countmap=new HashMap<>();
	char[]arr=s.toCharArray();
	for(char c:arr) {
		if(countmap.containsKey(c)) {
			int count=countmap.get(c);
				countmap.put(c, count+1);
			
		}
		else {
			countmap.put(c, 1);
		}
	}
	System.out.println("the duplicate characters are:");
	for(Map.Entry<Character, Integer>entry:countmap.entrySet()) {
		if(entry.getValue()<1) {
			System.out.println(entry.getKey());
		}
	}
}
}
