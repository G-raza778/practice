package forPractice1;

public class primeNumberSplit {
public static void main(String[] args) {
	int num=10;
	int count=0;
	for(int i=2;i<num-1;i++) {
		if(num%i==0) {
			count++;
			System.out.println(i);
			
		}
		
		
	}
	System.out.println(count);
}
}
