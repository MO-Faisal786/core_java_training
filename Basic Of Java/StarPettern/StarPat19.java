package StarPettern;

public class StarPat19 {
    public static void main(String[] args) {
        int row = 5;
        int col = 1;
        int spc = row - 1;
        

        for (int i = row; i >= 1; i--) {
            char c = (char)(64 + i);
            for (int j = 1; j <= spc; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= col; j++) {
                System.out.print(c++ +" ");
                // num++;
            }
            System.out.println();
            spc--;
            col++;
        }
    }
}
