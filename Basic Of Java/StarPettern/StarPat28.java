package StarPettern;

public class StarPat28 {
    public static void main(String[] args) {
        int row = 5;
        int col = row;

        for (int i = row; i >= 1; i--) {
            char c = (char)(64 + i);
            for (int j = 1; j <= col; j++) {
                System.out.print(c++ +" ");
            }
            System.out.println();
            col--;
        }
    }
}
