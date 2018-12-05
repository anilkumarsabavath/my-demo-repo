package m_prac;

import java.util.Arrays;

public class Large_small {

	public static void main(String[] args) {
		int num[]= {-5,1,3,45,678,-3836};
		int largest=num[0];
		int smallest= num[0];
		for(int i=1;i<num.length;i++) {
			if(num[i]>largest) {
				largest=num[i];
			}else if(num[i]<smallest){
				smallest=num[i];
			}
		}
		System.out.println("given array: "+Arrays.toString(num));
		System.out.println(largest);
		System.out.println(smallest);
	}

}
