public class Day12 {
    static boolean checkRotation(String s1, String s2) {

        if (s1.length() != s2.length()) return false;

        String s3 = s1 + s1;
        if (s3.contains(s2)) {
            return true;
        } 
        
        return false;
        
    }
    public static void main(String[] args) {
        // String s1 = "bcda";
        // String s2 = "abcd";

        String s1 = "bdca";
        String s2 = "abcd";

        if (checkRotation(s1, s2)) {
            System.out.println("Yes, "+s2+" is the rotation of "+s1+".");
        } else {
            System.out.println("No, "+s2+" is not the rotation of "+s1+".");
        }
    }
}
