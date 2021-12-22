package ex03_myhai;

import java.util.Scanner;

public class ex_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt();
        System.out.println("Enter the numbers: ");

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;

        for (int i = 0; i < n; i++) {
            int currentNumber = input.nextInt();
            if (currentNumber % 2 == 0) {
                p1++;
            }
            if (currentNumber % 3 == 0) {
                p2++;
            }
            if (currentNumber % 4 == 0) {
                p3++;
            } else {
                System.out.println("None");
            }
        }
        double output1 = p1 * 100.00 / n;
        double output2 = p2 * 100.00 / n;
        double output3 = p3 * 100.00 / n;

        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);


    }
}
