class CheckPalindrome {
    static void isPalindrome(int num) {
        int temp = num;
        int rev = 0;
        while (temp != 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        if (rev == num) {
            System.out.println("It is a Palindrome Number.");
        } else {
            System.out.println("It is not a Palindrome Number.");
        }
    }

    static void isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        boolean flag = true;

        while(i<j) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }

        if (flag) {
            System.out.println("It is a Palindrome String.");
        } else {
            System.out.println("It is not a Palindrome String.");
        }
    }

}


public class MethodOverLoading {
    public static void main(String[] args) {
        CheckPalindrome.isPalindrome(121);
        CheckPalindrome.isPalindrome("abfv");
    }
}
