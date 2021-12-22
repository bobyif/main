package ex02_myhai;
import java.util.Scanner;

public class exe02_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print ("n = ");
        int n = input.nextInt();
        System.out.println("Enter the numbers: ");

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i <= n; i++) {
            leftSum = leftSum + input.nextInt ();
        }

        for (int i = 1; i <= n; i++) {
            rightSum = rightSum + input.nextInt();
        }

        if (leftSum == rightSum){
                System.out.println ("Yes, sum = " + leftSum);
    } else {
        int difference = Math.abs (leftSum - rightSum);
        System.out.println ("No, diff = " + difference);
        }

    }
}
