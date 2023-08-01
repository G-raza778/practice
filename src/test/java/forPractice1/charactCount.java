package forPractice1;

import java.util.HashMap;
import java.util.Map;

public class charactCount {
public static void main(String[] args) {
	String s="count of the charcter";
	char []c=s.toCharArray();
	Map<Character,Integer>countMap=new HashMap<>();
	for(Character i:c) {
		if(countMap.containsKey(i)) {
			int count=countMap.get(i);
			countMap.put(i, count+1);
		}
		else {
			countMap.put(i, 1);
		}
	}
	for(Map.Entry<Character, Integer>entry:countMap.entrySet()) {
		System.out.println(entry.getKey()+":"+entry.getValue());
		System.out.println("---------------------------");
		if(entry.getValue()>1) {
			System.out.println(entry.getKey());
		}
	}
}
}
