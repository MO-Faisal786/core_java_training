class Vahicle {
    void run() {
        System.out.println("Vahicles is running at speed of 85KM/h.");
    }
}

class Bike extends Vahicle {
    void run() {
        System.out.println("Bike is running at speed of 70KM/h.");
    }
}

public class Example1 {
    public static void main(String[] args) {
        Bike bike1 = new Bike();
        bike1.run();
    }
}
