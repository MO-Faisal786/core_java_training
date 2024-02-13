
public class Day5 {

    static boolean isMagicSqure(int[][] matrix) {
        int diaSum1 = 0;
        int diaSum2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            diaSum1 += matrix[i][i];
            diaSum2 += matrix[i][matrix.length - 1 - i];
        }

        if (diaSum1 != diaSum2) return false;
        
        for (int i = 0; i < matrix.length; i++) {
            int sumRow = 0;
            int sumCol = 0;
            for (int j = 0; j < matrix.length; j++) {
                sumRow += matrix[i][j];
                sumCol += matrix[j][i];
            }
            if (sumRow != sumCol || sumCol != diaSum1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] matrix = {{2, 7, 6},
                          {9, 5, 1},
                          {4, 3, 8}};

        if(isMagicSqure(matrix)) {
            System.out.println("Yes, it is a magic square");
        } else {
            System.out.println("No, it is not a magic square");
        }
    }
}
