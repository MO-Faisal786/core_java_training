package StarPettern;

public class StarPat2 {
    public static void main(String[] args) {
        int row = 3;
        int star = 1;

        for(int i = 1; i <= row; i++) {
            for (int j = star; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
