package forPractice1;

public class sumOfDigits {
public static void main(String[] args) {
	int i=1234;
	int sum=0;
	while(i!=0) {
		sum+=i%10;
		i=i/10;
	}
	System.out.println(sum);
}
}
