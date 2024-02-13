package StarPettern;

public class StarPat31 {

    public static int factorial(int num) {
        int fac = 1;
        for (int i = num; i >= 1; i--) {
            fac *= i;
        }
        return fac;
    }
    public static void main(String[] args) {
        int row = 5;
        int col = 1;
        int spc = row - 1;

        // System.out.println(factorial(row));

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < spc; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < col; j++) {
                System.out.print(factorial(i)/(factorial(i-j) * factorial(j)) + " ");
            }
            System.out.println();
            spc--;
            col++;
        }
    }
}
