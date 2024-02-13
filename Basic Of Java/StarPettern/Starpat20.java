package StarPettern;

public class Starpat20 {
    public static void main(String[] args) {
        int row = 5;
        int star = 1;
        int spc = row-1;
        
        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= spc; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
            star+=2;
            spc--;
        }
    }
}
