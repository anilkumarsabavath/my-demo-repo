package practice3;

public class Interev {

	public static void main(String[] args) {
		//using string and wrapperclass
		/*String r="1234";
		String rev="";
		for(int i=r.length()-1;i>=0;i--) {
			rev=rev+r.charAt(i);
		}
		
int f = Integer.parseInt(rev);
System.out.println(f);
int c=25+f;
System.out.println(c);
//using while loop
int num=1234;
int rev1 =0;
while(num!=0) {
	rev1=rev1*10+num%10;
	num=num/10;
}
System.out.println(rev1);

 
String h=String.valueOf(rev1);
String re="";
for(int j=h.length()-1;j>=0;j--) {
	re=re+h.charAt(j);
	System.out.println(re);
}*/
		//using for loop
int num=12345;
int rev=0;
for(int num1=12345;num!=0;) {
	rev=rev*10+num%10;
	num=num/10;
}
//System.out.println(rev);
int n=123456;
System.out.println(new StringBuffer(String.valueOf(n)).reverse());
	}
	

}
