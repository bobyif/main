package ex03_myhai;

import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("days ");
        int days = input.nextInt();
        int treatedPatients = 0;
        int untreatedPatients = 0;
        int doctors = 7;
        int i;
        for (i = 1; i <= days; i++){
            System.out.println("patients");
            int patients = Integer.parseInt(input.next());
            if ((i % 3 == 0) && (untreatedPatients > treatedPatients)) {
                doctors = doctors + 1;

            }   if  (patients > doctors) {
                treatedPatients += doctors;
                untreatedPatients = untreatedPatients + (patients - doctors);
            }
            else{
                treatedPatients += patients;
            }
        }
        System.out.println("Treated patients : " + treatedPatients);

        System.out.println("untreated patients : "+ untreatedPatients);
    }
}
