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
public class ClassCastExeption {
    public static void main(String[] args) {
        User user = new User();
        user.name = "Faisal Malik";
        user.phone = 1234567890l;
        user.chat();


        // Admin admin = (Admin) user;// It return an exeption(runtime error ) if we try to perform downcast without upcasting
        // admin.chat();

        // avoid it with the help of instanceof
        if (user instanceof Admin){
            Admin admin = (Admin) user;
            admin.addUser();
            }else{
                System.out.println("This is not an instance of Admin");
            }
    }
}
