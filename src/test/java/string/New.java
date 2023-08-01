package string;

import java.util.LinkedHashMap;
import java.util.Map;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "java";
		
		LinkedHashMap<Integer, Character> map = new LinkedHashMap<>();
		for(int i=s.length()-1;i>=0;i--) {
			map.put(i, s.charAt(i));
		
		}
		
		for (Map.Entry<Integer, Character> entry : map.entrySet()) {		
			System.out.print(entry.getValue());
		}
	}
}
