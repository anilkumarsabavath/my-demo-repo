package interview;

public class Repla {

	public static void main(String[] args) {
		String [] a= {"xyyz","abbc","ajsn","sdsd"};
		for(int i=0;i<=a.length-1;i++) {
			String x=a[i];
			for(int j=x.length()-1;j>=0;j--){
				if(x.charAt(j)==x.charAt(j--)) {
					System.out.println(a[i]);
					
				}else {
					System.out.println("not");
				}
				
			}
			
		}
		
	}

}
