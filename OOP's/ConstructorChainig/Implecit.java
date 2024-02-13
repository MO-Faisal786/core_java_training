


class A {
    int i;
    A(){
        System.out.println("A() executed.");
        this.i = 10;
    }
}
class B extends A {
    int j;
    B(){
        System.out.println("B() executed.");
        this.j = 20;
    }
}
class C extends B {
    int k;
    C(){
        System.out.println("C() executed.");
        this.k = 30;
    }
}



public class Implecit {
    public static void main(String[] args) {
        C c = new C();
        System.out.println("Value of i: " + c.i); // Value of i: 10
        System.out.println("Value of j: " + c.j); // Value of j: 20
        System.out.println("Value of k: " + c.k); // Value of k: 30
    }
}
