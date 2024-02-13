package StarPettern;

public class StarPat39 {
    public static void main(String[] args) {
        int row = 9;
        int col = row/2 + 1;

        for (int i = 1; i <= row; i++) {
            char c = 'A';
            for (int j = 1; j <= col; j++) {
                System.out.print(c++ +" ");
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
