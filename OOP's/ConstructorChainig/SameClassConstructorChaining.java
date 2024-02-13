
class Dunki{
    String s;
    int i;
    Dunki(int i){
        System.out.println("Dunki(int i) executed.");
        this.i = i;
    }

    Dunki(String s, int i) {
        this(i);
        System.out.println("Dunki(String s, int i) executed.");
        this.s = s;
    }

    Dunki() {
        this("Dunki", 30);
        System.out.println("Dunki() executed.");
    }
}

public class SameClassConstructorChaining {
    public static void main(String[] args) {
        Dunki dunki = new Dunki();
        System.out.println("Value of i: " + dunki.i);
        System.out.println("Value of s: " + dunki.s);
    }
}
