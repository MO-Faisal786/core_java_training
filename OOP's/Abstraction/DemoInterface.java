interface Demo{
    int i = 20; // Data member is public, static and final by default
    void m1(); // by default methods are abstract in interfaces
    public abstract void m2(); 
}
class Implement1 implements Demo{
    public void m1() {
        System.out.println("The m1() of Implement1"); 
    }

    public void m2(){
        System.out.println("The m2() of Implement1");
    }
}

public class DemoInterface {
    public static void main(String[] args) {
        System.out.println(Demo.i);
        Demo demo = new Implement1();
        demo.m1();
        demo.m2();
    }
}
