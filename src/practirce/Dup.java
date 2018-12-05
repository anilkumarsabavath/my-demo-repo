package practirce;

import java.util.HashSet;
import java.util.Set;

public class Dup {

	public static void main(String[] args) {
		//System.out.println("anil");
		String  name[]= {"anil","baby","satwa","rahul","manisha","chandan","anil","satwa"};
		for(int i=0;i<name.length;i++) {
			for(int j=i+1;j<name.length;j++) {
				if(name[i].equals(name[j])) {
					System.out.println("dupliate vale:"+name[i]);
				}
			}
		}
		Set<String> store=new HashSet<String>();
		for(String names:name) {
			if(store.add(names)==false) {
				System.out.println(names);
			}
		}

	}

}
