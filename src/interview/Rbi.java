package interview;

public interface Rbi {
	int min_bal=50;
	public void debit();
	public void credit();
	public void transer();
	 default void run(int a) {
		 
		System.out.println(a);
	}

}
