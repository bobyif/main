package testing;


import java.util.Arrays;

public class Selection_Sort1 {
    public static int[] myArray = {35,25,66,70};
    public static void main(String[] args){
        Selection_Sort();
        System.out.println("Arrays " + Arrays.toString(myArray));
    }
    public static void Selection_Sort(){
        for(int j = 0; j < myArray.length - 1; j++){
            int minIndex = j;
            for(int k = j + 1; k < myArray.length; k++){
                if(myArray[k] < myArray[minIndex]){
                    minIndex = k;
                }
            }
            int temp = myArray[j];
            myArray[j] = myArray[minIndex];
            myArray[minIndex] = temp;
        }
    }
}
