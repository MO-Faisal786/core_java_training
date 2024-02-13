package dynamicEmp;
public class EmpData {
	private int id;
	private String fullName;
	private int age;
	private double salary;
	
	public EmpData(int id, String fullName, int age, double salary) {
		this.id = id;
		this.fullName = fullName;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmpData [" + id + ", " + fullName + ", " + age + ", " + salary + "]";
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		EmpData empData = (EmpData) obj;
		return this.id == empData.id;
	}
	
	
}
