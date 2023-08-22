package arrays;

import java.util.Arrays;

public class ThirdLargest {
public static void main(String[] args) {
	int []arr= {9,2,3,1,6,7,5};
	Arrays.sort(arr);
	int max=arr[arr.length-1];
	int secondMax=0;
	int thirdMax=0;
	System.out.println("hightest number in the array:"+max);
	for(int i=arr.length-2;i>=0;i--) {
		if(arr[i]<max) {
			secondMax=arr[i];
			break;
		}
	}
	System.out.println(secondMax);
	for(int i=arr.length-3;i>=0;i--) {
		if(arr[i]<secondMax) {
			thirdMax=arr[i];
			break;
		}
	}
	System.out.println(thirdMax);
}
}
