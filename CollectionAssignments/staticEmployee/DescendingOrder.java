package staticEmployee;

import java.util.Comparator;

public class DescendingOrder implements Comparator<Employee>{
//	private String type;
//	public Order(String type) {
//		this.type = type;
//	}

	@Override
	public int compare(Employee o1, Employee o2) {
//		if(this.type.equals("descending")) {
//			return -(o1.getId() - o2.getId()); 
//		}
		return -(o1.getId() - o2.getId());	
	}
	
}
