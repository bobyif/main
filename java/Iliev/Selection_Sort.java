import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

    public class Selection_Sort {

        static int[] myArray;


        public static void main(String[] args)
        {

            Scanner input = new Scanner(System.in);

            System.out.println("input number of elements :");
            int N = input.nextInt();
            myArray = new int[N];

            myArrayFill();

            System.out.println("Elements BEFORE Selection Sort : " + Arrays.toString(myArray));
            System.out.println();

            SelectionSort();

            System.out.println("Elements AFTER Selection Sort : " + Arrays.toString(myArray));
            System.out.println();


        }
        static void myArrayFill() {

            for (int i = 0; i < myArray.length - 1; i++) {
                Random myRandom = new Random();
                myArray[i] = myRandom.nextInt(100);

            }
        }

        static void SelectionSort() {
            int IndexOfMin;
            int i, j;

            for (i = 0; i < (myArray.length - 1); i++){
                IndexOfMin = i;

                for (j = i + 1; j <= (myArray.length -1); j++){
                    if(myArray[j] < myArray[IndexOfMin])
                        IndexOfMin = j;
                }

                int Buffer = myArray[i];
                myArray[i] = myArray[IndexOfMin];
                myArray[IndexOfMin] = Buffer;

            }

        }
}
