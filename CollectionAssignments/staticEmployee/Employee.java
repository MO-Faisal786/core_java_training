package staticEmployee;

public class Employee implements Comparable<Employee>{
	private int id;
	private String fullName;
	private int age;
	private String gender;
	private String department;
	private double salary;
	
	public Employee(int id, String fullName, int age, String gender, String department, double salary) {
		this.id = id;
		this.fullName = fullName;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
	}
	

	public int getId() {
		return id;
	}


	public int getAge() {
		return age;
	}


	public String getGender() {
		return gender;
	}


	public String getDepartment() {
		return department;
	}


	public double getSalary() {
		return salary;
	}


	@Override
	public String toString() {
		return "Employee [" + id + ", " + fullName + ", " + age + ", " + gender + ", "
				+ department + ", " + salary + "]";
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		return this.id == e.id;
	}

	@Override
	public int compareTo(Employee o) {
		return this.getId() - o.getId();
	}

}
