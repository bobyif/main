import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class insertion_Sort {

    static int[] myArr;

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("input number of elements :");
        int N = input.nextInt();
        myArr = new int[N];

        myArrayFill();

        System.out.println("Elements BEFORE insertion Sort : " + Arrays.toString(myArr));
        System.out.println();

        insertion_sort();

        System.out.println("Elements AFTER insertion Sort : " + Arrays.toString(myArr));
        System.out.println();


    }
    static void myArrayFill() {

        for (int i = 0; i < myArr.length - 1; i++) {
            Random myRandom = new Random();
            myArr[i] = myRandom.nextInt(100);

        }
    }

    static void insertion_sort() {
        int n = myArr.length;
        for (int j = 1; j < n; j++) {
            int key = myArr[j];
            int i = j-1;
            while ( (i > -1) && ( myArr [i] > key ) ) {
                myArr [i+1] = myArr [i];
                i--;
            }
            myArr[i+1] = key;
        }
    }
}
