public class BitwiseOROp {
    public static void main(String[] args) {
        System.out.println("Welcome to the interview:-");
        int uscore = 57;
        int rscore = 60;
        int uyop = 2023;
        int ryop = 2023;

        boolean res = (uscore>=rscore) | (uyop==ryop);
                    //            false|true = true
        System.out.println("Allow for the interview: "+res);

        int a = 4; // 0 1 0 0
        int b = 5; // 0 1 0 1
        // -------------------  
        //            0 1 0 1 = 5

        System.out.println(a|b); // 5
    }
}
