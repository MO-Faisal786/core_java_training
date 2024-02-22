package MapPackage;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(101, "Faisal");
		map.put(102, "Shubham");
		map.put(103, "Rahul");
		map.put(104, "Ravi");
		map.put(104, "Sonali");
		
		System.out.println(map.get(101));
		System.out.println(map.get(102));
		System.out.println(map.get(103));
		System.out.println(map.get(104));
	}

}
