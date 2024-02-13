class Address {
	String village;
	int pincode;

	Address(String village, int pincode) {
		this.village = village;
		this.pincode = pincode;
	}

	void details() {
		System.out.println("===Employee Address===");
		System.out.println("Village: "+this.village);
		System.out.println("Pincode: "+this.pincode);
	}
}

class Employee {
	String employeeName;
	int id;
	String degination;
	Address address;

	Employee(String employeeName, int id, String degination, Address address) {
		this.employeeName = employeeName;
		this.id = id;
		this.degination = degination;
		this.address = address;
	}

	void details() {
		System.out.println("===Emplloyee details====");
		System.out.println("Emplloyee Name: "+employeeName);
		System.out.println("Degination: "+degination);
		address.details();
	}
}


class HasARelationship {
	public static void main(String[] args) {
		Address address = new Address("Moradabad", 244001);
		Employee emp = new Employee("Faisal", 10, "Software Engg.", address); 
		emp.details();
	}
}