package StarPettern;

public class StarPat36 {
    public static void main(String[] args) {
        int row = 9;
        int col = 1;
        int spc = row/2;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= spc; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }

            System.out.println();

            if (i<=row/2) {
                spc--;
                col++;
            } else {
                spc++;
                col--;
            }
        }

    }
}
