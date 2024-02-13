package StarPettern;

public class StarPat25 {
    public static void main(String[] args) {
        int row = 5;
        int col = row;

        for (int i = 1; i <= row; i++) {
            for (int j = col; j >= 1; j--) {
                System.out.print(j+" ");
            }

            System.out.println();
            col--;
        }
    }
}
