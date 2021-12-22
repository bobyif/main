package testing;

public class Bubble_Sort1 {
    public static void main(String[] args){
        System.out.println(args[0]);
    }
    public void sort(int[] array){
        for (var i = 0; i < array.length; i++)
            for (var j = 1; j < array.length; j++)
                if (array[j] < array[j - 1])
                    swap(array, j, j - 1);

    }
    private void swap(int[] array,int index1, int index2){
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


}
