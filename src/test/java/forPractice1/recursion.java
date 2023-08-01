package forPractice1;

public class recursion {
public static void main(String[] args) {
	recursion r=new recursion();
	r.chained(1);
}
public void chained(int i) {
	System.out.println(i);
	i++;
	chained(i);
}
}
