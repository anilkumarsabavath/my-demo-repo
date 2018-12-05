package interview;

public class Test {
	private int a;

	public Test() {
		System.out.println("anil");
	}

	public Test(int a) {
		System.out.println(a);
	}

	public void nat(int i) {
		System.out.println("final");
		System.out.println(i);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public static void main(String[] args) {
		for (int i = 0; i > -1; i++) {
			System.out.println(i);
		}
	}

}
