package forPractice1;

public class primeNUmbers1To100 {
public static void main(String[] args) {
	for(int i=2;i<=100;i++) {
		int c=0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
			c++;
				
			}
		}
		if(c==2) {
		System.out.println(i);
	}
}
}
}

