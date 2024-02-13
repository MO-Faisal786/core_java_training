class Employee { // Constructor overloading
	int id;
	String name;
	String department;
	int age;
	int salary;

	Employee() {
		System.out.println("Instance/Object is being created.");
	}

	Employee(int Id, String Department) {
		id = Id;
		department = Department;
	}

	Employee(int Id, String Name, String Department, int Age, int Salary){ 
		id = Id;
		name = Name;
		department = Department;
		age = Age;
		salary = Salary;
	}


	void aboutEmp(){
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Department: "+department);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
	}
}


class Constructor {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		System.out.println("================================================");
		Employee emp2 = new Employee(987, "IT");
		emp2.aboutEmp();
		System.out.println("================================================");
		Employee emp3 = new Employee(234, "faisal", "CSE", 22, 20000);
		emp3.aboutEmp();
	}
}