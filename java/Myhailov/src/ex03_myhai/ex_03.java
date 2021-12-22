package ex03_myhai;

import java.util.Scanner;

public class ex_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = 18;
        System.out.print("heritage ");
        float heritage = input.nextFloat();

        System.out.print("year ");
        int year = input.nextInt();

        for (int i = 1800; i <= year; i++)
            if (i % 2 == 0) {
                heritage = heritage - 12000;
                age = age + 1;

            } else {
                heritage = heritage - (12000 + (50 * age));
                age = age + 1;
            }
        if (heritage > 0){
            System.out.println("Yes! He will live a carefree life and will have " + heritage + " dollars left.");
        }else{
            System.out.println("He will need " + heritage + " dollars to survive");
        }
    }
}
