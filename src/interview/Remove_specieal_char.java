
package interview;
//by using reguler expression

public class Remove_specieal_char {

	public static void main(String[] args) {
		String s="30e0820200jdkqwiqw&%^&$#*&^%(%*983nkdnkn";
		s=s.replaceAll("[^a-zA-Z0-9]", "anil");
		System.out.println(s);

	}

}
