


public class ReverseNum {
    public static void main(String[] args) {
        int num = 153;
        int rev = 0;

    
        while (num != 0) {
            int rem = num%10;
            rev = rev * 10 + rem;
            num /= 10;
        }

        System.out.println(rev + " is a reverse number");
        
        
    }
}
