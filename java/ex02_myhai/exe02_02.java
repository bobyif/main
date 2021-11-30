package com.company;
import java.util.Scanner;

public class exe02_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print ("n = ");
        int n = Integer.parseInt(input.nextLine());
        System.out.println ("Enter the numbers: ");

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i <= n; i++) {
            int element = Integer.parseInt(input.nextLine());

            if (i % 2 == 0) {
                evenSum += element;
            } else {
                oddSum += element;
            }
        }
        int difference = Math.abs (oddSum - evenSum);
        if (oddSum == evenSum){
            System.out.print("Yes, Sum = " + evenSum);
        }else{
            System.out.print("No, Diff = " + difference);

        }

    }
}