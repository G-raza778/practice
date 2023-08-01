package forPractice1;

public class arrray1 {
	public static void main(String[] args) {
		
int []a= {11,21,23,32,13,31};
int maxNum=a[0];
for(int i=0;i<a.length;i++) {
	if(a[i]>maxNum) {
		maxNum=a[i];
	}
}
System.out.println(maxNum);
}
}
