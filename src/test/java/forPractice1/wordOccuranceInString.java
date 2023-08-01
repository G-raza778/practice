package forPractice1;

import java.util.HashMap;
import java.util.Map;

public class wordOccuranceInString {
public static void main(String[] args) {
	String s="my name name is is is raza raza";
	String str[]=s.split(" ");
	Map<String, Integer>wordCOuntMap=new HashMap<>();
	for(String word:str) {
		if(wordCOuntMap.containsKey(word)) {
			int count=wordCOuntMap.get(word);
			wordCOuntMap.put(word, count+1);
		}
		else {
			wordCOuntMap.put(word, 1);
		}
	}
	for(Map.Entry<String, Integer>entry:wordCOuntMap.entrySet()) {
		System.out.println(entry.getKey()+":"+entry.getValue());
	}
	
}
}
