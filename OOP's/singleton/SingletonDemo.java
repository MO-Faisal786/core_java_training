class Singleton {
    private Singleton(){};
    private static Singleton instance = null;
    public static Singleton getInstance() {
        if (instance == null) {
            System.out.println("Creating a new Instance of Singleton");
            instance = new Singleton();
            }
        return instance;
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton st1 = Singleton.getInstance();
        Singleton st2 = Singleton.getInstance();
        Singleton st3 = Singleton.getInstance();


        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
    }
}
