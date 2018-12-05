package interview;

import java.util.HashSet;
import java.util.Set;

public class Duolicate {

	public static void main(String[] args) {
		String name[]= {"anil","satwa","nanda","koushal","anil","satwa"};
		for(int i=0;i<name.length;i++) {
			for(int j=i+1;j<name.length;j++) {
				if(name[i]==(name[j])) {
					
					System.out.println("original value:"+name[i]);
				}
				
			}
		}
	
	Set<String> sr= new HashSet<String>();
	for(String names:name) {
		if(sr.add(names)==true) {
			System.out.println("dupliacte:"+names);
		}
		
	}
	}
}
