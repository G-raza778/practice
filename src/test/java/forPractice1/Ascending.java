package forPractice1;

public class Ascending {
public static void main(String[] args) {
	int []arr= {3,4,2,1,6,34,6,78,9,89};
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				sum=arr[i];
				arr[i]=arr[j];
				arr[j]=sum;
			}
			
	}
}
	System.out.println();
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
}
}
