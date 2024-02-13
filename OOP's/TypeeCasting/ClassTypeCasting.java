class User{
    String name;
    long phone;

    void chat() {
        System.out.println(name+" chating in the group with phone "+phone);
    }
}

class Admin extends User{
    void addUser() {
        System.out.println(name+" adding another user.");
    }
}

public class ClassTypeCasting {
    public static void main(String[] args) {
        User user = new Admin(); //Implicit casting
        // User user = (User) new Admin(); //Explicit casting
        user.name = "Faisal Malik";
        user.phone = 9012345678l;
        user.chat();
        // user.addUser(); // it will return error because super class ref varcan access only super class property and method

        Admin admin = (Admin) user; //now we can use all properties and method
        admin.chat();
        admin.addUser();
    }
}
