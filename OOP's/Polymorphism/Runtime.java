class Parent { // RunTime polymorphism

    String name = "Irfan";
    void property() {
        System.out.println("Parent Property use/access.");
    }

    void decision() {
        System.out.println("Parent Decision Anita.");
    }
}


class Child extends Parent{

    String name = "Faisal";
    void decision() {
        System.out.println("Child decision is Sunita.");
    }
}


public class Runtime {

    public static void main(String[] args) {
        Parent parent = new Child(); //to understand upcasting
        parent.decision();
    }
}



