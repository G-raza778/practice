package string;

import java.util.ArrayList;
import java.util.List;



public class thisIsAGood {
public static void main(String[] args) {
	String s="this is a man";
	String s1="man is good";
	
	String []ArrS=s.split(" ");
	String []ArrS1=s1.split(" ");
	
	List<String>newLIst=new ArrayList<>();
	
	for(String i:ArrS) {
	newLIst.add(i);
	}
	for(String e:ArrS1) {
		if(newLIst.contains(e))
		newLIst.remove(e);
	
	else {
		newLIst.add(e);
	}
	}
	
	System.out.println(newLIst);
}
}
