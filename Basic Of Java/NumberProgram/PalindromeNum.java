


public class PalindromeNum {
    public static void main(String[] args) {
        int num = 121;
        int rev = 0;
        int temp = num;
        
        while (temp != 0) {
            int rem = temp%10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        

        if (num == rev)
        System.out.println(num + " is a Palindrome number");
        else
        System.out.println(num + " is not a Palindrome number");
        
    }
}
