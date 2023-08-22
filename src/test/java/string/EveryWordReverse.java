package string;

public class EveryWordReverse {
public static void main(String[] args) {
	String s="gulam ahmed raza";
	String []arr=s.split(" ");

	for(String i:arr) {
		String s1="";
		for(int j=i.length()-1;j>=0;j--) {
			s1=s1+i.charAt(j);
			System.out.print(s1);
		}
		System.out.println(" ");
	}
}
}
