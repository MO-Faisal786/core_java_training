package staticEmployee;
import java.util.*;

public class ForCollection {
	public LinkedList<Employee> subhamCollection = new LinkedList<Employee>();
	{
		subhamCollection.add(new Employee(70, "Fasial", 22, "male", "CSE", 20000));
		subhamCollection.add(new Employee(20, "Shubham", 22, "male", "IT", 16000));
		subhamCollection.add(new Employee(30, "Malik", 69, "male", "CSE", 25000));
		subhamCollection.add(new Employee(40, "Ravi", 22, "male", "IT", 29000));
		subhamCollection.add(new Employee(80, "Sonali", 62, "female", "CSE", 95000));
	}
	
	// All Employees 
	public void listEmp() {		
		for(Employee emp : this.subhamCollection) {
			System.out.println(emp);
		}
	}
	
	// gender based employees
	public void genderBased(String gender) {
		for(Employee emp : this.subhamCollection) {
			if(emp.getGender().equals(gender)) {
				System.out.println(emp);
			}
		}	
	}
	
	// Age Based
	public void empGt60() {
		for(Employee emp : this.subhamCollection) {
			if(emp.getAge() >= 60) {
				System.out.println(emp);
			}
		}
	}
	
	// Department wise
	public void getDepartmentWise(String department) {
		for(Employee emp : this.subhamCollection) {
			if(emp.getDepartment().equals(department)) {
				System.out.println(emp);
			}
		}
	}
	
	
	// id based ascendingOrder
	public void ascendingOrder() {		
		TreeSet<Employee> localCollection = new TreeSet<Employee>();
		localCollection.addAll(subhamCollection);
		for(Employee emp : localCollection) {
			System.out.println(emp);
		}
		
	}
	
	// id wise descending order
	public void descendingOrder() {		
		TreeSet<Employee> localCollection = new TreeSet<Employee>(new DescendingOrder());
		localCollection.addAll(subhamCollection);
		for(Employee emp : localCollection) {
			System.out.println(emp);
		}
	}
	
	// Salary based
	public void salaryBased() {
		TreeSet<Employee> localCollection = new TreeSet<Employee>(new SalaryOrder());
		localCollection.addAll(subhamCollection);
		for(Employee emp : localCollection) {
			System.out.println(emp);
		}
	}
}
