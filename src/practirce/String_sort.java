package practirce;

import java.util.Arrays;

public class String_sort {
	
	
	
	public static String sort(String statment) {
 char [] arry=statment.toCharArray();
 Arrays.sort(arry);
 
		
		return new String(arry);
		
	}

	public static void main(String[] args) {
		String statment="anil kumar";
		
		String output=String_sort.sort(statment);
		System.out.println(output);
	}
	

}
