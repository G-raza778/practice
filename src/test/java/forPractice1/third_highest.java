package forPractice1;

public class third_highest {
public static void main(String[] args) {
	String s="i am a bad boy";
	int count=1;
	for(int i=0;i<s.length()-1;i++){
		if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')) {
			count++;
		}
		
	}
	System.out.println(count);
}
}
