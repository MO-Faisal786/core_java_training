package StarPettern;

public class StarPat35 {
    public static void main(String[] args) {
        int row = 9;
        int col = 1;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();
            if (i<=row/2) {
                col++;
            } else {
                col--;
            }
        }
    }
    
}