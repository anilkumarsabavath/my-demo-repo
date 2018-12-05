package interview;

public class Thirty {

	public static void main(String[] args) {
		String s = "13 thousend 13 hunred and 13";
		Object[] a = s.split(" ");

		for (int i = 0; i < a.length; i++) {
			if (a[i].equals("13")) {
				System.out.print(a[i]);
			}

		}

	}

}
