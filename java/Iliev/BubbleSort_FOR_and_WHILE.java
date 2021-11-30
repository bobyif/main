package com.company;
import java.util.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort_FOR_and_WHILE 
    {
    static int[] myArr;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random myRand = new Random();


        System.out.print("Bъведете размерността на масива /N/ : ");
        int N = input.nextInt();

        myArr = new int[N];

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = myRand.nextInt(100);
        }
        System.out.println("Преди сортиране с FOR : " + Arrays.toString(myArr));
        bubSortFor();
        System.out.println("След сортиране с FOR : " + Arrays.toString(myArr));
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = myRand.nextInt(100);
        }

        System.out.println();
        System.out.println("Преди сортиране с DO-WHILE : " + Arrays.toString(myArr));
        bubSortDo(); // извИквам метода за сортиране
        System.out.println("След сортиране с DO-WHILE : " + Arrays.toString(myArr));
    }


    public static void bubSortFor() {
        int n = myArr.length;

        for (int i = 0; i < n - 1; i++) {
            for (i = 0; i < n - i - 1; i++) {
                if (myArr[i] > myArr[i + 1]) {
                    int temp = myArr[i];
                    myArr[i] = myArr[i + 1];
                    myArr[i + 1] = temp;
                }
            }
        }
    }

    public static void bubSortDo() {
        int n = myArr.length - 1;
        boolean swapped = false;

        do {
            swapped = false;
            n--;
            for (int i = 0; i <= n; i++) {
                if (myArr[i] > myArr[i + 1]) {
                    int temp = myArr[i];
                    myArr[i] = myArr[i + 1];
                    myArr[i + 1] = temp;
                    swapped = true;
                }
            }
        }
        while (swapped);
    }
}