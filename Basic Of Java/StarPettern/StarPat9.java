package StarPettern;

public class StarPat9 {
    public static void main(String[] args) {
        int row = 8;
        int spc = row/2;
        int star = 1;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= spc; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }

            System.out.println();
            if (i <= row/2) {
                spc--;
                star+=2;
            } else {
                spc++;
                star-=2;
            }
        }
    }
}
