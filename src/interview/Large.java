package interview;

import java.util.Arrays;

public class Large {
	public static void main(String[] args) {
		int num[]= {56,-86,65,78,43};
		System.out.println(num.length);
		int large=num[0];
		int small=num[0];
		for(int i=1;i<num.length;i++) {
			if(num[i]>large) {
			large=num[i];
			}	
			else if(num[i]<small) {
				small=num[i];
			}
		}
		System.out.println(Arrays.toString(num));
		System.out.println("small number in the given array::"+small);
		System.out.println("large number in the given array::"+large);
	}
	}