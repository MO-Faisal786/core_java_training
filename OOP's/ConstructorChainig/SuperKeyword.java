
class Dinga{
    int i = 10;
    void m1() {
        System.out.println("m1() of Dinga");
    }
}

class Linga extends Dinga {
    int i = 20;
    void m1() {
        super.m1();
        System.out.println("m2() of Linga"); 
        System.out.println("Dinga i: "+super.i);
        System.out.println("Linga i: "+this.i);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Dinga l = new Linga();
        System.out.println(l.i);
        l.m1();
    }
    
}