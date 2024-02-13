public class Variables {
    public static void main(String[] args) {
        Integer i = 10;
        printI(i);
        System.out.println(i);
    }

    public static void printI(Integer i){
        System.out.println(i);
        i= 20;
    }
}
