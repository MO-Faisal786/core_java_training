package StarPettern;

public class StarPat14 {
    public static void main(String[] args) {
        int row = 5;
        int col = 1;
        char c = 'A';
        for (int i = 1; i <= row; i++) {
            
            for (int j = 1; j <= col; j++) {
                System.out.print(c+" ");
            }
            System.out.println();
            c++;
            col++;
        }
    }
}
