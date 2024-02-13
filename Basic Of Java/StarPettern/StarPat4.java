package StarPettern;

public class StarPat4 {
    public static void main(String[] args) {
        int row = 5;
        int spc = row - 1;
        int star = 1;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= spc; j++) {
                System.out.print("  ");
                
            }
            for (int j = star; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            spc--;
        }

    }
}
