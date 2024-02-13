package StarPettern;

public class StarPat6 {
    public static void main(String[] args) {
        int row = 6;
        int spc = 0;
        int star = 2*(row-1)+1;

        for (int i = 1; i <= row; i++) {
            
            for (int j = 1; j <= spc; j++) {
                System.out.print("  ");
            }

            for (int j = 2*(i-1) + 1; j <= star; j++) {
                System.out.print("* ");
            }

            System.out.println();
            spc++;
        }
    }
}
