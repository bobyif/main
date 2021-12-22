package ex03_myhai;

import java.util.Scanner;

public class ex_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  n = scan.nextInt();


        int spaces = n - 1;
        int stars = 1;

        for (int rows = 0; rows < n; rows++) {
            for (int i = 0; i < spaces ; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < stars ; i++) {
                System.out.print("* ");
            }
            System.out.println();
            spaces --;
            stars ++;
        }
        spaces = 1;
        stars = n - 1;
        for (int rows = 0; rows < n-1 ; rows++) {
            for (int i = 0; i < spaces ; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < stars ; i++) {
                System.out.print("* ");
            }
            System.out.println();
            spaces ++;
            stars --;
        }
    }
}
