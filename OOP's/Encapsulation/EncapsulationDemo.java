class MyBean {
    private String userName;
    private String password;
    private int age;
    private int id;

    public void setUserName(String userName) {
        // here we can validate or write logic
        this.userName = userName;
        System.out.println("User name set.");
    }
    public void setPassword(String password) {
        // here we can validate or write logic
        if (password.length() >= 8) {
            this.password = password;
            System.out.println("password set.");
        } else {
            System.out.println("Passwird length must 8 charector long.");
        }
    }
    public void setAge(int age) {
        // here we can validate or write logic
        this.age = age;
        System.out.println("Age set.");
    }
    public void setId(int id) {
        // here we can validate or write logic
        this.id = id;
        System.out.println("ID set.");
    }

    public void print(){
        System.out.println("This is the user details...");
        System.out.println("Username : " + this.userName);
        System.out.println("Password : " + this.password);
        System.out.println("Age : " + this.age);
        System.out.println("ID : " + this.id);

    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        MyBean myBean = new MyBean();
        myBean.setUserName("Faisal Malik");
        myBean.setPassword("786&Ayan");
        myBean.setAge(23);
        myBean.setId(111);
        myBean.print();

        System.out.println("After Change the data...");
        myBean.setUserName("Ayan Malik");
        myBean.setPassword("786");
        myBean.setAge(21);
        myBean.setId(122);
        myBean.print();
    }
}
