class Calculator { // It is the example of compile time poly morphism
    static void add(int i, int j) { // Metho declararion
        System.out.println("Sum of " + i + " and " + j + " is: " + (i+j));
    }

    static void add(double i, double j) {
        System.out.println("Sum of " + i + " and " + j + " is: " + (i+j));
    }
}
public class CompileTime {
    public static void main(String[] args) {
        Calculator.add(10, 20); //Method call or defination
        Calculator.add(10.5, 20.7); // Method overloading
    }
}
