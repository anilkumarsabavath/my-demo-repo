package interview;

public class Reversing_string {
	//differnce between string and string bufffer
	//is string has reversable method
public static String s="12345";
 public static String rev="";
	public static void main(String[] args) {
		int len=s.length();
		System.out.println(len);
		for(int i=len-1;i>=0;i--) {
			 rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		StringBuffer sf= new StringBuffer(s);
		System.out.println(sf.reverse());
	}
	
	

}
