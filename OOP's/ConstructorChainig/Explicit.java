
class A {
    int i;
    A(int i) {
        System.out.println("A constructor");
        this.i = i;
    }
}

class B extends A {
    int j;
    B(int j) {
        super(10); // calling the parent's constructor
        System.out.println("B Constructor");
        this.j = j;
    }
}

class C extends B {
    int k;
    C(int k) {
        super(20); // calling the grandparent's constructor
        System.out.println("C Constructor");
        this.k = k;
    }
}

public class Explicit {
    public static void main(String[] args) {
        C c = new C(30);
        System.out.println(c.i);
        System.out.println(c.j);
        System.out.println(c.k);
    }    
}
