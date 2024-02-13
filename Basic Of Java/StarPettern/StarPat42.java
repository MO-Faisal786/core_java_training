package StarPettern;

public class StarPat42 {
    public static void main(String[] args) {
        int row = 5;
        int col = 1;
        int spc = row - 1;

        for (int i = 1; i <= row; i++) {
            int num = 1;
            for (int j = 1; j <= spc; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= col; j++) {
                
                System.out.print(num+" ");
                if (j<=col/2) {
                    num++;
                } else {
                    num--;
                }
            }
            System.out.println();
            col += 2;
            spc--;
        }
    }
}
