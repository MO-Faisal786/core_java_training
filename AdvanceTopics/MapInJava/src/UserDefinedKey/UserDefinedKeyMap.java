package UserDefinedKey;

import java.util.*;
import java.util.Map.Entry;

public class UserDefinedKeyMap {

	public static void main(String[] args) {
		Map<Batch, Subject> map = new HashMap<Batch, Subject>();
		
		map.put(new Batch(10, "Core Java Training"), new Subject(29, "Basic"));
		map.put(new Batch(12, "Core Java Training"), new Subject(29, "Basic"));
		map.put(new Batch(14, "Core Java Training"), new Subject(29, "Basic"));
		
		Set<Entry<Batch, Subject>> set = map.entrySet();
		
		for (Entry<Batch, Subject> entry : set) {
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
	}

}
