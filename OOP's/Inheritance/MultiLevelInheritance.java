// Multilevel Inheritance

class A{
	int id;
	String name;

	void printA(){
		System.out.println("====This is the methood of A.====");
		System.out.println("Id: "+this.id);
		System.out.println("Name: "+this.name);
	}
}

class B extends A{
	String department;
	void printB(){
		System.out.println("====This is the method of B.====");
		System.out.println("Id: "+this.id);
		System.out.println("Name: "+this.name);
		System.out.println("Department: "+this.department);
	}
}

class C extends B{
	String address;
	void printC(){
		System.out.println("====This is the method of C.====");
		System.out.println("Id: "+this.id);
		System.out.println("Name: "+this.name);
		System.out.println("Department: "+this.department);
		System.out.println("Address: "+this.address);
	}
}



class MultiLevelInheritance {
	public static void main(String[] args) {
		C var = new C();
		var.id = 20;
		var.name = "Faisal";
		var.department = "CSE";
		var.address = "Moradabad";
		var.printA();
		var.printB();
		var.printC();
	}
}