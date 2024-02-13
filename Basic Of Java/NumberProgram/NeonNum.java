
public class NeonNum {
    public static void main(String[] args) {
        int num = 45;
        int squaredNum = num*num;
        int sum = 0;

        while (squaredNum != 0) {
            int rem = squaredNum%10;
            sum += rem;
            squaredNum /=10;
        }

        if (num == sum)
            System.out.println(num+" is a neon number.");
        else 
            System.out.println(num+" is not a neon number");
        
    }
}
