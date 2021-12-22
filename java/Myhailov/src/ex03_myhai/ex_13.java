package ex03_myhai;

import java.util.Scanner;

public class ex_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int stars = 0;
        int space = n;

        for (int rows = 0; rows <= n; rows++) {
            for (int i = 0; i < space; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }
            System.out.print("|");
            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }
            System.out.println();
            space --;
            stars ++;

        }
    }
}