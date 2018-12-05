package m_prac;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		String s[]= {"anil","anilk","latha","baby","anil","baby"};
		/*	for(int i=0;i<s.length;i++) {
            for(int j=i+1;j<s.length;j++) {
            	if(s[i].equals(s[j])) {
System.out.println(s[i]);            		
            	}
            }			
		}
*/
		//using hashset
/*		Set<String> store= new HashSet<String>();
		for(String name:s) {
			if(store.add(name)==false) {
				System.out.println(name);
			}
			
		}*/
		Map<String,Integer> storemap= new HashMap<String,Integer>();
		for(String names:s) {
			Integer count=storemap.get(names);
			if(count==null) {
				storemap.put(names, 1);
			}
			else {
				storemap.put(names, ++count);
			}
			
		}
		Set<Entry<String,Integer>> entryset=storemap.entrySet();
		for(Entry<String,Integer> entry:entryset) {
			if(entry.getValue()>1) {
System.out.println("duplicate values: "+entry.getKey());				
			}
			else {
				System.out.println("which are single"+entry.getKey());
			}
		}
	}

}
