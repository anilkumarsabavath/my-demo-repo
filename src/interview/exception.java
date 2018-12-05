 package interview;

public class exception {
  
	
	public static void main(String[] args) {
	String s= "anil kumar @ satwa";
	String s1[]=s.split(" ");
	int len=s1.length;
	System.out.println(len);
	String rev="";
	String revk="";
	int length=rev.length();
	for(int i=len-1;i>=0;i--) {
		rev=" "+s1[i];
		for(int j=rev.length()-1;j>=0;j--) {
			revk=revk+rev.charAt(j);
			}
		}
		System.out.println(revk);
		
	
	}
	 

 
	

	}

