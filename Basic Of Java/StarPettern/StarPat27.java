package StarPettern;

public class StarPat27 {
    public static void main(String[] args) {
        int row = 5;
        int col = row;

        for (int i = 1; i <= row; i++) {
            char c = 'A';
            for (int j = col; j >= 1; j--) {
                System.out.print(c++ + " ");
                // c++;
            }

            System.out.println();
            col--;
        }
    }
}
