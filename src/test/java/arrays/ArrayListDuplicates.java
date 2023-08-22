package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDuplicates {
public static void main(String[] args) {
	int []arr= {1,3,2,4,2,5,4};
	Arrays.sort(arr);
	ArrayList<Integer>list=new ArrayList<>();
	for(Integer i:arr) { 
		list.add(i);
	}
	ArrayList<Integer>newArr=new ArrayList<>();
	for(Integer i:list) {
		if(!newArr.contains(i)) {
			newArr.add(i);
		}
	}
	System.out.println(newArr);
	
}
}
