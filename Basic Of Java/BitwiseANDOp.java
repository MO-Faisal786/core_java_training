public class BitwiseANDOp {
    public static void main(String[] args) {
        System.out.println("Welcome to the ATM");
        int upin = 2341;
        int dpin = 2341;
        int amt = 500;
        int bal = 1000;

        boolean res = (upin == dpin) & (amt <= bal);
        //                     true & true = true
        System.out.println("withdraw success: "+res);

        int a = 4; // 0 1 0 0
        int b = 5; // 0 1 0 1
        // -------------------  
        //            0 1 0 0 = 4

        System.out.println(a&b);

        


    }
}
