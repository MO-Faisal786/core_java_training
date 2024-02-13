class Employee {
    int id;
    String name;

    void details() {
    	System.out.println("=== Inside detaikls method of Employee class.===");
    	System.out.println("This: "+this);
    	System.out.println("Id: "+id); //0
    	System.out.println("Name: "+name);//null

    }
    
}


public class ThisKeyword {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.err.println("===Inside main of this keyword.===");
        System.out.println(emp);
        System.out.println("emp.id: "+emp.id);
        System.out.println("emp.name: "+emp.name);
        emp.details();
    }
}
