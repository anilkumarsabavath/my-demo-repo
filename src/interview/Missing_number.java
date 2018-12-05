package interview;

public class Missing_number {

	public static void main(String[] args) {
		int a[]= {-2,-1,0,1,3,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
System.out.println(sum);
	
	
	int sum1=0;
	for(int j=-2;j<=5;j++) {
		sum1=sum1+j;
		
	}
	System.out.println(sum1);
	System.out.println((sum1-sum));
	}
	
}
