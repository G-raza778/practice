package string;

public class StringRevUsingREc {
	public static void main(String[] args) {
		String s="hello";
		int length=s.length();
		main2(s,length);
	}
	public static void main2(String s,int length) {
	
		if(length<=0) {
		char c=s.charAt(length);
		System.out.println(c);
		length--;
		main2(s,length);
		
		}
	}
}
