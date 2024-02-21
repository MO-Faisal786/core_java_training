package MapPackage;

import java.util.*;
import java.util.Map.Entry;

public class MapIteration2 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("RN101", "Faisal");
		map.put("RN102", "Shubham");
		map.put("RN103", "Rahul");
		map.put("RN104", "Ravi");
		map.put("RN105", "Sonali");
		map.put("RN1001", "Mike");
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
	}

}
