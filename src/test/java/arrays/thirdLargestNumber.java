package arrays;

import java.util.Arrays;

public class thirdLargestNumber {
public static void main(String[] args) {
	int []arr= {2,1,3,6,4,8,43,53,61,32,5,0};
	Arrays.sort(arr);
	int maxNum=arr[arr.length-1];
	System.out.println(maxNum);
	int secondHeighest=0;
	int thirdHeighest=0;
	for(int i=arr.length-1;i>=0;i--) {
		if(arr[i]<maxNum) {
			secondHeighest=arr[i];
			break;
		}
	}
	System.out.println("second heighest:"+secondHeighest);
	for(int i=arr.length-2;i>=0;i--) {
		if(arr[i]<secondHeighest) {
			thirdHeighest=arr[i];
			break;
			
		}
	}
	System.out.println("third heighest:"+thirdHeighest);
}
}
