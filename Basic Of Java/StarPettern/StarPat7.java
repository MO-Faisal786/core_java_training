package StarPettern;

public class StarPat7 {
    public static void main(String[] args) {
        int row = 8;
        int star = 1;
        
        for (int i = 1; i <= row; i++) {
            if (i<=(row/2) + 1) {
                for (int j = star; j <= i; j++) {
                    System.out.print("* ");
                }
                
            } else {
                for (int j = 1; j <= (row+1-i); j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        // for (int i = 1; i <= row; i++) {

        //     for (int j = 1; j <= star; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();

        //     if (i <= (row / 2)) {
        //         star++;
        //     } else {
        //         star--;
        //     }

        // }
    }
}
