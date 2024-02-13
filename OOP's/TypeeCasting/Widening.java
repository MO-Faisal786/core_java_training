
public class Widening {
    public static void main(String[] args) {
        byte b = 10; //byte is a widening type, it can hold the value of int also
        System.out.println("byte b: "+b);
        short s = b; //Widening implicit casting
        System.out.println("short s: "+s);
        short s1 = (short) b; // Explecit widening
        System.out.println("short s1: "+s1);

    }
}
