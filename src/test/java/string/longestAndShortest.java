package string;

import java.util.HashMap;
import java.util.Map;

public class longestAndShortest {
public static void main(String[] args) {
	String s="i love you forever";
	String s1[]=s.split(" ");
	Map<String,Integer>countMap=new HashMap<>();
	 for(String word:s1) {
		 int count=word.length();
		 countMap.put(word, count);
	 }
	 for(Map.Entry<String, Integer>entry:countMap.entrySet()) {
		 System.out.println(entry.getKey()+":"+entry.getValue());
	 }
}
}
