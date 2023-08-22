package string;

import java.util.HashMap;
import java.util.Map;

public class dupWordInString {
public static void main(String[] args) {
	String s="i love my india and i love all citzens";
	String str[]=s.split(" ");
	Map<String,Integer>mapCount=new HashMap<>();
	for(String i:str) {
		if(mapCount.containsKey(i)) {
			int count=mapCount.get(i);
			mapCount.put(i, count+1);
		}
		else {
			mapCount.put(i, 1);
		}
	}
	for(Map.Entry<String, Integer>entry:mapCount.entrySet()) {
		if(entry.getValue()>1) {
			System.out.println(entry.getKey());
		}
	}
	
}
}
