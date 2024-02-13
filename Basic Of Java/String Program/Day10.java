
public class Day10 {

    static boolean isBalanced(String str) {
        char[] stack = new char[str.length()];
        int i = -1;
        for(char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++i] = ch;
            } else if ((i != -1) && 
            ((ch == ')' && stack[i] == '(') || 
             (ch == '}' && stack[i] == '{') || 
             (ch == ']' && stack[i] == '['))) {
                    i--;
            } else {
                return false;
            }
        }
        return i == -1;
    }

    public static void main(String[] args) {
        // String str = "[()]{}{[()()]()}"; // case 1
        String str = "[(])"; // case 2

        if (isBalanced(str)) {
            System.out.println("The expression is balanced");
        } else {
            System.out.println("The expression is not balanced");
        }
    }
}