class Employee {
    int id;
    String name;

    void details() {
        System.out.println("===Inside the main details method of class Employee");
        int id = 10;
        String name = "Faisal";
        System.out.println("Id: "+id);//10  // JVM aleways give priority to local variable if variables name are same as instance variable.
        System.out.println("Name: "+name);//faisal
        System.out.println("this: "+this);
        System.out.println("this.id: "+this.id);//0
        System.out.println("this.name: "+this.name);//null

    }
}


public class ThisKeyWord2 {
    public static void main(String[] args) {
        System.out.println("===Inside the main method of the ThisKeyWord2===");
        Employee emp = new Employee();
        System.out.println("emp: "+emp);
        System.out.println("emp.id: "+emp.id);
        System.out.println("emp.name: "+emp.name);
        emp.details();
    }
}
