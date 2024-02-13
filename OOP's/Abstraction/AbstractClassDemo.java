abstract class Demo {
    static int i = 20;
    int j = 30;

    Demo() {
        System.out.println("Constructor of Demo");
    }
    void m1() {
        System.out.println("m1() of Demo");
    }

    abstract void m2();
}

class DemoImpl1 extends Demo {
    DemoImpl1(){
        super();
        System.out.println("Constructor of DemoImpl1");
    }

    void m2() {
        System.out.println("m2() of DemoImpl1");
    }
}
class DemoImpl2 extends Demo {
    DemoImpl2(){
        super();
        System.out.println("Constructor of DemoImpl2");
    }

    void m2() {
        System.out.println("m2() of DemoImpl2");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        System.out.println(Demo.i);
        Demo d1 = new DemoImpl1();
        System.out.println(d1.j);
        d1.m1();
        d1.m2();


        Demo d2 = new DemoImpl2();
        d2.j = 90;
        System.out.println(d2.j);
        d2.m1();
        d2.m2();
    }
}
