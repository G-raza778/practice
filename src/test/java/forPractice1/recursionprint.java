package forPractice1;

public class recursionprint {
public static void main(String[] args) {
	main2(1);
}
public static void main2(int num) {
	if(num<=100) {
		System.out.println(num);
		main2(num+1);
	}
}
}
