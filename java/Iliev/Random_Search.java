package ex02_myhai;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Random_Search {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random myRandom = new Random();

        int[] Array = new int[25];
        byte[] Taken = new byte [25];
        int number = 0;
        int count = 0;
        int M = 0;
        boolean end = false;

        System.out.println("Моля въведете търсеното число /M/ : ");
        M = input.nextInt();

        for (int i = 0;  i <= Array.length - 1; i++)
        {
            Array[i] = myRandom.nextInt(100);
            while (!end)
            {

                number++;

                int i1 = myRandom.nextInt(25);

                if (Array[i1] == M) {
                    System.out.println("Има намерено съвпадение на индекс [ " + i + " ]");
                    Taken[i1] = 1;
                    break;
                }  else
                {
                    Taken[i1] = 1;
                    count = 0;

                    for (byte b : Taken) {if (b == 1) {count++;}}

                    if (count == 25) {
                        end = true;
                        System.out.println("Няма открити съвпадения");
                    }
                }
            }
        }

        System.out.println("Направени итерации    : " + number);
        count = 0;
        for (byte b : Taken) {
            if (b == 1)  {
                count++;
            }
        }
        System.out.println("Брой проверени индекси : " + count);
        System.out.println("Моят масив : " + Arrays.toString(Array));
        System.out.println("Битовия масив : " + Arrays.toString(Array));



    }
}