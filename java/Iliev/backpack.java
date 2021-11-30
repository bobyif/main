import java.util.Scanner;
class backpack {
    public static void main(String[] args) {
        int index = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input capacity (KG) : ");
        int m = scan.nextInt();

        System.out.println("Please input the number of subjects (2 to 5): ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Input the weight of the subject (not less than 2KG) : ", i);
            arr[i] = scan.nextInt();
            System.out.println();
        }
        while (m > 0 && index  <= arr.length) {
            if (arr[index] <= m) {
                System.out.println();
                System.out.println("Weight of the subject is: " + arr[index]);
                System.out.println("In the backpack (" + m + "-" + arr[index] + ") there are left " + (m - arr[index]) + " KG");
                m = m - arr[index];
                index++;
            }
            else {
                System.out.println("There are no items to accurately represent the weight of the backpack ");
                break;
            }

        }
        System.out.println();
        if (m == 0) {
            System.out.println("There are items to accurately represent the weight of the backpack ");
        }
    }
}
