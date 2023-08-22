package string;

import java.util.ArrayList;
import java.util.List;

public class sampleString {
public static void main(String[] args) {
	String s="we are the people of the republic india";
	String []arr=s.split(" ");
	List<String >newString=new ArrayList<>();
	for(String e:arr) {
		newString.add(e);
	}
	System.out.println(newString);
	int size=newString.size();
	StringBuilder sb=new StringBuilder();
	for(int i=size-1;i>=0;i--) {
		sb.append(arr[i]);
		if(i!=0) {
			sb.append(" ");
		}
		System.out.print( newString.get(i)+" ");
	}
}
}
