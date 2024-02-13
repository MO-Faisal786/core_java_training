package StarPettern;

public class StarPat18 {
    public static void main(String[] args) {
        int row = 5;
        int col =  1;
        int spc = row - 1;
        
        for (int i = 1; i <= row; i++) {
            char c = 'A';

            for (int j = 1; j <= spc; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= col; j++) {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
            spc--;
            col++;
        }
    }
}
