
public class Assignment3 {
    public static void main(String[] args) {
        String str = "Azam";
        System.out.println("Input: "+str);
        char [] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 97) {
                continue;
            } else {
                arr[i] = (char)  (arr[i]-32);
            }
        }

        System.out.print("Output: ");
        System.out.println(arr);
    }
}
