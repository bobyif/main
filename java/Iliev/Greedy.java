package ex02_myhai;
import java.util.Scanner;

public class Greedy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nominal = {50, 20, 10, 5, 2, 1};
        System.out.println("Моля въведете сумата (в лева и стотинки) : ");
        double sum = input.nextDouble();
        sum = sum * 100;
        System.out.println("Cумата в стотинки е :" + sum);
        int count = 0;
        int index = 0;
        while (sum > 0) {
            if (sum - nominal[index] >= 0)
            {
                count++;
                sum = sum - nominal[index];
                System.out.print(count + " номинал е от " + nominal [index] + " стотинки : ");
                System.out.println("Остатък : " + sum);

            }else
            {
                index++;

                if (index > nominal.length - 1)
                {
                    System.out.println();
                    System.out.println("Нямате достатъчно номинали. Непредставен остатък (в стотинки) : " + sum);
                    break;
                }
            }
        }


        System.out.println("-------------------------------------");
        System.out.println("ОБЩИЯ Брой на номиналите е " + count);
        System.out.println("-------------------------------------");


    }
}
