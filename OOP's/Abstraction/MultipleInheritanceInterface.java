interface A{
    void decide();
}

interface P1 extends A {
    void decide();
}

interface P2 extends A {
    void decide();
}

class C implements P1,P2 {
    public void decide() {
        System.out.println("You have to marry with Zoya.");
    }
}

public class MultipleInheritanceInterface {
    public static void main(String[] args) {
        C c = new C();
        c.decide();
    }
}
