package forPractice1;

public class Stringarry {
public static void main(String[] args) {
	String s="gulam.ahmed.raza";
	StringBuilder sb=new StringBuilder();
	for (int i = 0; i < s.length(); i++) {
		char c=s.charAt(i);
		if(c=='.') {
		sb.append(' ');
	}
		else { 
			sb.append(c);
		}
	}
	System.out.println(sb);
}
}
