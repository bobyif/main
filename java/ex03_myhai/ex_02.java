package ex03_myhai;

import java.util.Scanner;

public class ex_02 {
    public static int money;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("age = ");
        int age = input.nextInt();
        System.out.print("prize_wm = ");
        double prize_wm;
        prize_wm = input.nextDouble();
        System.out.print("prize_ty = ");
        int prize_ty = input.nextInt();
        int toys = 0;
        int index = 1;
        int brother = 0;
        for (int i = 1; i <= age; i++){
            if (i % 2 == 0) {
                money = money + (10 * index);
                brother++;
                index++;

            }else{
                toys++;
            }
        }
        if ((money - brother + (prize_ty * toys) - prize_wm) >= 0){
            System.out.println("Yes " + ((money - brother + (prize_ty * toys) - prize_wm)));
        }else{
            System.out.println("No " + ((money - brother + (prize_ty * toys) - prize_wm)));
        }

    }
}
