package m_prac;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maph {

	public static void main(String[] args) {
		String a[]= {"anil","anil","baby","baby"};
		Map<String,Integer> store=new HashMap<String,Integer>();
		
for(String names:a) {
	Integer count=store.get(names);
	if(count==null) {
		store.put(names,1);
	}else {
		store.put(names, ++count);
	}	
		
	
}
Set<Entry<String,Integer>> entryset=store.entrySet();
for(Entry<String,Integer>entry:entryset) {
	if(entry.getValue()>1) {
		System.out.println("duplicate values: "+entry.getKey());
	}
	else {
		System.out.println("single values are: "+entry.getKey());
	}
	
}
	}

}
