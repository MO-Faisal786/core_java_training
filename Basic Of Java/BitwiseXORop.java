public class BitwiseXORop {
    public static void main(String[] args) {
        System.out.println("Welcome to the interview:-");
        int uyoe = 3;
        int ryoe = 2;
        int uyop = 2023;
        int ryop = 2023;

        boolean res = (uyoe>=ryoe) ^ (uyop==ryop);
                    //         true^true = false
        System.out.println("Allow for the interview: "+res);

        int a = 4; // 0 1 0 0
        int b = 5; // 0 1 0 1
        // -------------------  
        //            0 0 0 1 = 1

        System.out.println(a^b); // 1
        System.out.println(1^1);
        System.out.println(0^0);
    }
}
