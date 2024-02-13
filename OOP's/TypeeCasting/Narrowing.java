

public class Narrowing {
    public static void main(String[] args) {
        short s = 10;
        System.out.println("short s: "+s);
        // byte b = s; // Narraowing can not be done implecitly we have to cast explicit
        byte b = (byte) s;
        System.out.println("byte b: "+b);
        

    }
}
