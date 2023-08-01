package forPractice1;

public class wodsCountchutiyagulam {
public static void main(String[] args) {
	String s="tujhe na dekhun to chain mujhe aata nahi hai";
	int count=1;
	for(int i=0;i<s.length()-1;i++) {
		if(s.charAt(i)==' ') {
			count++;
		}
	}
	System.out.println(count);
}
}
