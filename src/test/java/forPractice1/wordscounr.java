package forPractice1;

public class wordscounr {
public static void main(String[] args) {
	String s="all hell king booker";
	char c;
	int count=1;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==' ') {
			count++;
		}
	}
	System.out.println(count);
}
}
