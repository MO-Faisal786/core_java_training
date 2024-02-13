package banking;
import user.C; //import another package and access the spacific class
import user.*; // import and acccess all classes of another package
import ecart.D;

public class A {
    public static void main(String[] args) {
        System.out.println("This is the A of banking.");
        B.m();
        C.m();
        D.m();
        D.m(); // Qualified import and access
    }
    
}