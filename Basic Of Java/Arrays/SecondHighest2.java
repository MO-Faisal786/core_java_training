package Arrays;

import java.util.Scanner;

public class SecondHighest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int highest = Integer.MIN_VALUE;
        int secondHighest = highest;

        for(int i : arr) {
            if (highest<i) {
                secondHighest = highest;
                highest = i;
            }
        }

        if (secondHighest == Integer.MIN_VALUE) 
            System.out.println("There is no second highest value in the aray.");
        else 
            System.out.println("Second Highest: "+secondHighest);

        sc.close();
    }
}
