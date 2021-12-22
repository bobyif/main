package testing;

import java.util.Arrays;

public class Main {
    public static void main(String[] names){
        int[] number = {7, 3, 1, 4, 6, 2, 3 };
        var sorter = new Bubble_Sort1();
        sorter.sort(number);
        System.out.println(Arrays.toString(number));
    }
}
