package ex03_myhai;

import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print ("n = ");
        int n = input.nextInt();
        System.out.println ("Enter the numbers: ");

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 0; i < n; i++) {
            int currentNumber = input.nextInt();
            if (currentNumber < 200) {
                p1++;
            }
            else if (currentNumber >= 200 && currentNumber <= 399) {
                p2++;
            }
            else if (currentNumber >= 400 && currentNumber <= 599) {
                p3++;
            }
            else if (currentNumber >= 600 && currentNumber <= 799) {
                p4++;
            } else {
                p5++;
            }
        }
        double output1 = p1 * 100.00 / n;
        double output2 = p2 * 100.00 / n;
        double output3 = p3 * 100.00 / n;
        double output4 = p4 * 100.00 / n;
        double output5 = p5 * 100.00 / n;

        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);
        System.out.println(output5);



    }
}
