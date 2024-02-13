package StarPettern;

public class StarPat8 {
    public static void main(String[] args) {
        // int row = 5;
        // int spc1 = (row/2);
        // int spc2 = (row/2)-1;
        // int star = 1;
        
        // for (int i = 1; i <= row; i++) {
        //     if (i<=(row/2) + 1) {
                
                
        //         for (int j = 1; j <= spc1; j++) {
        //             System.out.print("  ");
        //         }
        //         for (int j = star; j <= i; j++) {
        //             System.out.print("* ");
        //         }
        //         spc1--;
                
        //     } else {

        //         for (int j = spc2; j >= 1; j--) {
        //             System.out.print("  ");
        //         }

        //         for (int j = 1; j <= (row+1-i); j++) {
        //             System.out.print("* ");
        //         }
        //         spc2++;
        //     }
        //     System.out.println();
        // }

        int row = 8;
        int star = 1;
        int spc = row/2;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= spc; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            System.out.println();

            if (i<=row/2) {
                star++;
                spc--;    
            } else {
                star--;
                spc++;
            }
        }
        
    }
}
