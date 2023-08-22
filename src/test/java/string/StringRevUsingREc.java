package string;

public class StringRevUsingREc {
	public static void main(String[] args) {
		String s="hello";
		//int length=s.length();
		main2(s);
		String rString=main2(s);
		System.out.println(rString);
	}
	public static String main2(String s) {
	if(s.length()<=1) {
		return s;
	}
		return main2(s.substring(1)+s.charAt(0));
		
		}
	}

