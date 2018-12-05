package practirce;

public class rever_int {

	public static void main(String[] args) {
		int num=12345;
		StringBuffer sf= new StringBuffer(String.valueOf(num));
		System.out.println(sf.reverse());
		
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			System.out.println(rev);
			num=num/10;
		}
		System.out.println(rev);
		
	}

}
