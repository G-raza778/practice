package arrays;

import java.util.ArrayList;
import java.util.List;

public class sort {
public static void main(String[] args) {
	int []arr= {2,1,3,5,47,6,0};
	List<Integer>newArr=new ArrayList<>();
	int max=0;
	int SndH=0;
	for(int i=0;i<=arr.length-1;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println(max);
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<max) {
			SndH=arr[i];
		}
	}
}
}
