package testing;

import java.util.Arrays;

public class Bubble_Sort2 {
    public static int[] numbers = {1,5,4,4234,7,4,7,7,8,45,5,62};
    public static void main(String[] args) {
    sort();
    System.out.println("Array " + Arrays.toString(numbers));

    }
    public static void sort(){
            for (var i = 0; i < numbers.length; i++)
                for (var j = 1; j < numbers.length; j++)
                    if (numbers[j] < numbers[j - 1])
                        change(j, j - 1);

        }
    public static void change(int index1, int index2){
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;

    }

}
