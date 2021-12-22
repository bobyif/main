package ex03_myhai;

import java.util.Scanner;
public class ex_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.print("+ ");
        for (int i = 0; i < n - 2; i++) {
            System.out.print("- ");
        }
        System.out.print("+");
        System.out.println();


        for (int i = 0; i < n - 2 ; i++) {
            System.out.print("| ");
            for (int j = 0; j < n - 2; j++) {
                System.out.print("- ");
            }
            System.out.print("| ");
            System.out.println();
        }
        System.out.print("+ ");
        for (int i = 0; i < n - 2; i++) {
            System.out.print("- ");

        }
        System.out.print("+");
        System.out.println();
    }
}
