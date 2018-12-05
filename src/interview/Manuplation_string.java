package interview;

public class Manuplation_string {

	public static void main(String[] args) {
		String s="my name is anil i am going becomeg an automation tester";
		String s1="my name is anil i am going becomeg An automation tester";
	/*String a="1i love my ";
		System.out.println(s.charAt(18));
		System.out.println(s.indexOf("g"));
int i=s.indexOf("g",s.indexOf("g")+2);
System.out.println(s.indexOf("g", i+1));
System.out.println(s.indexOf(" anil"));
System.out.println(s.substring(0, 9));
System.out.println(a.trim());
System.out.println(a.replaceFirst("[^a-z]", "9"));
System.out.println();*/
		System.out.println(s.equalsIgnoreCase(s1));

String s2="anil";
System.out.println(s2.concat("kumar"));
String x="hellow";
String y="world";
int x1=100;
int y1=200;
System.out.println(x1+x+y1+x);
	}
	
	

}
