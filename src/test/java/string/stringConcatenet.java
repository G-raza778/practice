package string;

public class stringConcatenet {
public static void main(String[] args) {
	String s1="automation";
	String s2="testing";
	StringBuilder sb=new StringBuilder();
	
	s1=s1+s2;
	s2=s1.substring(0,s1.length()-s2.length());
	s1=s1.substring(s2.length());
	System.out.println("s2:"+s2);
	System.out.println("s1:"+s1);
}
}
