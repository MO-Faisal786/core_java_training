public class UnaryOperators {
    public static void main(String[] args) {
        // int a = 11, b = 22, c;
        // c = a + b + a++ + b++ + ++a + ++b;
        // //  11+ 22+ 11(12)  + 22(23)  + 13 + 24  
        // System.out.println("a="+a);
        // System.out.println("b="+b);
        // System.out.println("c="+c);

        // int i = 0;

        // i = i++ - --i + ++i - i--;
        // //  0(1) - 0(0)+ 1(1) - 1(0)
         
        // System.out.println(i);

        // boolean b = true;
         
        // b++;
         
        // System.out.println(b);

        // int i=1, j=2, k=3;
         
        // int m = i-- - j-- - k--;
        //     // 1(0) - 2(1)- 3(2)
         
        // System.out.println("i="+i);
        // System.out.println("j="+j);
        // System.out.println("k="+k);
        // System.out.println("m="+m);

        
        int a=1, b=2;
         
        System.out.println(--b - ++a + ++b - --a);
        //             1(1) - 2(2) + 2(2) - 1(1)
        System.out.println("a = "+a);
        System.out.println("b = "+b);
            
    }
}
