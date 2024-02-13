
class ReverseNum {   

    static void reverse(int n) { 
        if (n < 10) {
            System.out.println(n);
            return;
        }

        System.out.print(n%10);
        reverse(n/10);
        
    }


    public static void main(String[] args) {
        System.out.print("Reversed Number is: " );
        reverse(2345);
    }
    
}
