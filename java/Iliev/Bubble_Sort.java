import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bubble_Sort
{

    static int[] myArray;
    static int[] myEven;
    static int[] myOdd;
    static int countEven = 0;
    static int countOdd  = 0;

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        Random  myRandom = new Random();

        System.out.println("Въведете брой елементи :");
        int N = input.nextInt();

        myArray = new int[N];


        for (int i = 0; i < myArray.length; i++)
        {
            myArray[i] = myRandom.nextInt(100);

        }

        divideArrays();


        System.out.println("ПРЕДИ СОРТИРАНЕ :: ");
        System.out.println("myArray : " + Arrays.toString(myArray));
        System.out.println("myEven : " + Arrays.toString(myEven));
        System.out.println("myOdd : " + Arrays.toString(myOdd));

        sortAscending();
        sortDescending();

        System.out.println();
        System.out.println("СЛЕД СОРТИРАНЕ :: ");
        System.out.println("myArray : " + Arrays.toString(myArray));
        System.out.println("myEven : " + Arrays.toString(myEven));
        System.out.println("myOdd : " + Arrays.toString(myOdd));


    }
    static void divideArrays()
    {

        for (int temp_int : myArray)
        {

            if (temp_int % 2 == 0)
            {
                countEven++;
            }
            else
            {
                countOdd++;
            }

        }

        myEven = new int[countEven];
        myOdd  = new int[countOdd];


        int count_all  = 0;
        int count_even = 0;
        int count_odd  = 0;

        while (count_all < myArray.length)
        {

            if (myArray[count_all] % 2 == 0)
            {
                myEven[count_even] = myArray[count_all];
                count_even++;
            }
            else
            {
                myOdd[count_odd] = myArray[count_all];
                count_odd++;
            }

            count_all++;

        }

    }

    static void sortAscending() {
            int r = myEven.length - 1;
            boolean swapped = false;
            do
                {
                swapped = false;
                r--;
                for (int i = 0; i <= r; i++)
                {
                    if (myEven[i] > myEven[i + 1])
                    {
                        int temp = myEven[i];
                        myEven[i] = myEven[i + 1];
                        myEven[i + 1] = temp;

                        swapped = true;
                    }
                }
            }
            while (swapped);

    }

    static void sortDescending() {
        int r = myOdd.length - 1;
        boolean swapped = false;
        do
        {
            swapped = false;
            r--;
            for (int i = 0; i <= r; i++)
            {
                if (myOdd[i] < myOdd[i + 1])
                {
                    int temp = myOdd[i];
                    myOdd[i] = myOdd[i + 1];
                    myOdd[i + 1] = temp;

                    swapped = true;
                }
            }
        }
        while (swapped);

    }

}
