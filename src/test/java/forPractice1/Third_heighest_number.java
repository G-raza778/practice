package forPractice1;

import java.util.Arrays;


public class Third_heighest_number {
public static void main(String[] args) {
	int arr[]= {0,4,-1,4,-1,5,66};
	Arrays.sort(arr);//{-1,-1,0,4,4,5,44}
	int maxNum=arr[arr.length-1];
	int SecMax = 0;
	int thirdMax = 0;
	for(int i=arr.length-2;i>0;i--) {
		if(arr[i]<maxNum) {//4,
			SecMax=arr[i];
			break;
		}
	}
	System.out.println(SecMax);
	for(int i=arr.length-3;i>0;i--) {
		if(arr[i]<SecMax) {
			thirdMax=arr[i];
			break;
		}
	}
	System.out.println(thirdMax);
	//purpose
	//propose
}
}
