package interview;

public class Reverse_integer {

	public static void main(String[] args) {
		int num=12345;
		int rev=0;
		//StringBuffer sf= new StringBuffer(String.valueOf(num));
		//System.out.println(sf.reverse());
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		//new StringBuffer(Reverse_integer(String.valueOf(num)));

	}

}
