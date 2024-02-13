class Parent {

    void property() {
        System.out.println("Parent Property use/access.");
    }

    void decision() {
        System.out.println("Parent Decision Anita.");
    }
}


class Child extends Parent{

    void decision() {
        System.out.println("Child decision is Sunita.");
    }
}


public class MethodOverride {

    public static void main(String[] args) {
        Child ch = new Child();
        ch.property();
        ch.decision();
    }
}



