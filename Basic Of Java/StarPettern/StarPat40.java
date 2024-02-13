package StarPettern;

public class StarPat40 {
    public static void main(String[] args) {
        int row = 9;
        int col = row/2 + 1;

        for (int i = 1; i <= row; i++) {  
            for (int j = col; j >= 1; j--) {
                char c = (char)('@' + j);
                System.out.print(c+" ");
            }
            System.out.println();

            if (i<=row/2) {
                col--;
            } else {
                col++;
            }
        }
    }
}
