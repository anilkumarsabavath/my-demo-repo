package interview;

public class How_many_ones {
	static int count=0;
public static void main(String[] args) {
	
	
	for(int i=1;i<=1000;i++) {
		String num=String.valueOf(i);
		String one="1";
		if(num.contains(one)) {
			//System.out.print(num+" ");
			count++;
		}
	}
	System.out.println("total nums with one : "+count);
}
}
