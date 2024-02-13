// find the perfect number 1 to 100



public class perfect {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("The list of perfect number from 1 to 100");
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i/2; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            if (sum == i) 
                System.out.print(i+"  ");
            
            sum = 0;
        }
    }
}

