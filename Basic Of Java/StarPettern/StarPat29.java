package StarPettern;

public class StarPat29 {
    public static void main(String[] args) {
        int row = 5;
        int col = 1;
        

        for (int i = 1; i <= row; i++) {
            char c = 'E';
            for (int j = 1; j <= col; j++) {
                System.out.print(c-- +" ");
                // c--;
            }
            System.out.println();
            col++;
        }
    }
}
