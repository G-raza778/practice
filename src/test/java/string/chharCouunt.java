package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class chharCouunt {
public static void main(String[] args) {
	String s="please couunt the charcters in it";
	char []ch=s.toCharArray();
	Map<Character,Integer>countMap=new HashMap<>();
	for(Character c:ch) {
		if(countMap.containsKey(c)) {
			int count=countMap.get(c);
			countMap.put(c, count+1);
		}
		else {
			countMap.put(c,1);
		}
	}
	for(Map.Entry<Character, Integer> entry:countMap.entrySet()) {
		System.out.println(entry.getKey()+":"+entry.getValue());
	}
}
}
