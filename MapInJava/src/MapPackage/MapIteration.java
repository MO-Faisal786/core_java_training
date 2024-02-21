package MapPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIteration {

	public static void main(String[] args) {
Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(101, "Faisal");
		map.put(102, "Shubham");
		map.put(103, "Rahul");
		map.put(104, "Ravi");
		map.put(105, "Sonali");
		
		Set<Integer> keySet = map.keySet();
		
		for(Integer key : keySet) {
			System.out.println(key+"-->"+map.get(key));
		}
	}

}
