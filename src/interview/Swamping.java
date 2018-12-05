package interview;

public class Swamping {

	public static void main(String[] args) {
		//using third varieable
		
		int x=4567;
		int y=5467;
				
		x=x^y;
		y=x^y;
		x=x^y;
		
		System.out.println(x);
		System.out.println(y);
		
	}

}
