package ex03_myhai;

import java.util.Scanner;

public class ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt();
        System.out.println("Enter the weight: ");

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        float absolute = 0;

        for (int i = 0; i < n; i++) {
            int weight = input.nextInt();
            absolute = absolute + weight;
            if (weight <= 3) {
                p1 = p1 + weight;
            }
            else if (weight < 11 && weight > 4){
                p2 = p2 + weight;
            }else{
                p3 = p3 + weight;
            }
        }
        double tons = (p1 * 200.00 + p2 * 175.00 + p3 * 120.00) / 25.00;
        System.out.println(tons);

        double output1 = (p1 / absolute) * 100;
        double output2 = (p2 / absolute) * 100;
        double output3 = (p3 / absolute) * 100;

        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);


    }
}