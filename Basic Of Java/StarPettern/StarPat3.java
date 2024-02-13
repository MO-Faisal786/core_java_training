package StarPettern;

public class StarPat3 {
    public static void main(String[] args) {
        int row = 3;
        int star = 3;

        for(int i = 1; i <= row; i++) {
            for (int j = i; j <= star; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}