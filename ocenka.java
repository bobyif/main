import java.util.Scanner;

public class ocenka {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double  evaluation = scanner.nextDouble();

        if (evaluation >= 5.5) {

            System.out.println ("Отлично!");
        } else if (evaluation >= 4.5) {

            System.out.println ("Mного Добър!");
        }else if (evaluation >= 3.5) {

            System.out.println("Добър!");
        }else if (evaluation >= 3) {

            System.out.println("Среден!");
        }else {

            System.out.println("слаб!");

        }
    }
}