package dynamicEmp;
import java.util.*;

public class EmployeeDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedHashSet<EmpData> employees= new LinkedHashSet<EmpData>();
		String choice;
		do {
			System.out.println("Do you have registered? Enter yes for yes or no for no...");
			choice = sc.next();
			if (choice.equals("no")) {
				System.out.println("Enter your details...");
				System.out.print("ID: ");
				int id = sc.nextInt();
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Age: ");
				int age = sc.nextInt();
				System.out.print("Salary: ");
				double salary = sc.nextDouble();
				EmpData empDetails = new EmpData(id, name, age, salary);
				boolean status = employees.add(empDetails);
				if(status) {
					System.out.println("Employee details added...."+empDetails);
				} else {
					System.out.println("Employee not added due to invalid credientions...");
				}
			} 
		} while(!choice.equals("yes"));
		
		System.out.println("Thank you...");
		sc.close();
	}

}
