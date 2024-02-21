package MapPackage;

import java.util.*;

public class LinkedMap {

	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<String, String>();
		
		map.put("RN101", "Faisal");
		map.put("RN102", "Shubham");
		map.put("RN103", "Rahul");
		map.put("RN104", "Ravi");
		map.put("RN105", "Sonali");
		
		Set<String> keySet = map.keySet();
		
		for(String key : keySet) {
			System.out.println(key+"-->"+map.get(key));
		}
	}

}
