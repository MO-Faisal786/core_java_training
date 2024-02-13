
public class Assignment1 {
    public static void main(String[] args) {
        String str = "AZAM";
        System.out.println("Input: "+str);
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (arr[i]+32);
        }
        System.out.print("Input: ");
        System.out.println(arr);
    }
}
