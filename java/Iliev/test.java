import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class test {
    static int[] myArray;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random  myRandom = new Random();

        System.out.println("Въведете брой елементи :");

        int N = input.nextInt();
        myArray = new int[N];
        sortAscending();

        for (int i = 0; i < myArray.length; i++)
        {
            myArray[i] = myRandom.nextInt(100);

        }

        System.out.println(Arrays.toString(myArray));
    }

        static void sortAscending(){
            int r = myArray.length - 1;
            boolean swapped = false;
            do {
                swapped = false;
                r--;
                for (int i = 0; i <= r; i++) {
                    if (myArray[i] > myArray[i + 1]) {
                        int temp = myArray[i];
                        myArray[i] = myArray[i + 1];
                        myArray[i + 1] = temp;

                        swapped = true;
                    }
                }
            }
            while (swapped);
        }

}