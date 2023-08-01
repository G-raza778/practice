package forPractice1;

public class rec {
public static void main(String[] args) {
	main2(1,100);

	
}
public static void main2(int start,int end) {
if(start<=end) {
	System.out.println(start);
	main2(start+1, end);
}
}
}
