package ex02_myhai;
import java.util.Scanner;

public class exe02_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double oddMin = Double.MAX_VALUE;
        double oddMax = Double.MIN_VALUE;
        double oddSum = 0;
        double evenMin = Double.MAX_VALUE;
        double evenMax = Double.MIN_VALUE;
        double evenSum = 0;
        for (int i = 0; i < n; i++) {
            int currentNumber = input.nextInt();
            if(currentNumber % 2 != 0){
                if(currentNumber < oddMin) {oddMin = currentNumber;}
                if(currentNumber > oddMax) {oddMax = currentNumber;}
                oddSum += currentNumber;
            } else {
                if(currentNumber < evenMin) {evenMin = currentNumber;}
                if(currentNumber > evenMax) {evenMax = currentNumber;}
                evenSum += currentNumber;
            }
        }
        System.out.println("OddSum=" + oddSum + ",");
        System.out.println("OddMin=" + ((oddMin != Double.MAX_VALUE) ? oddMin + "," : "No,"));
        System.out.println("OddMax=" + ((oddMax != Double.MIN_VALUE) ? oddMax + "," : "No,"));
        System.out.println("EvenSum=" + evenSum + ",");
        System.out.println("EvenMin=" + ((evenMin != Double.MAX_VALUE) ? evenMin + "," : "No,"));
        System.out.println("EvenMax=" + ((evenMax != Double.MIN_VALUE) ? evenMax + "," : "No,"));
    }
}