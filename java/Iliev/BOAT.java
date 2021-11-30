package com.company;

public class BOAT {


    static int L = 7;
    static int V = 1;
    static int K = 2;
    static int Z = 3;
    static boolean ERR = false;

    static int counterOK = 0;

    public static void main(String[] args) {
        while (V == 1 && K == 2 && Z == 3) {

            for (int i = 1; i <= 3; i++) {
                ERR = false;

                if (L == 7) {
                    L = L * 10;
                }

                System.out.println("--------------------------------------------------------------");

                if (i == 1 && V != 10) {
                    V = V * 10;
                    System.out.println("Прехвърлям Вълк.");
                }

                if (i == 2 && K != 20) {
                    K = K * 10;
                    System.out.println("Прехвърлям Коза.");
                }

                if (i == 3 && Z != 30) {
                    Z = Z * 10;
                    System.out.println("Прехвърлям Зелка.");
                }

                printStatus();

                if ((V == 1 && K == 2) || (K == 2 && Z == 3)) {
                    ERR = true;

                    System.out.println("Грешен ход");

                    if (V == 10 && i == 1) {
                        V = V / 10;
                    }
                    if (K == 20 && i == 2) {
                        K = K / 10;
                    }
                    if (Z == 30 && i == 3) {
                        Z = Z / 10;
                    }

                } else {
                    if ((V == 10 && K == 20 && L == 7) || (K == 20 && Z == 30 && L == 7)) {

                        ERR = true;

                        System.out.println("Грешен ход");

                        if (V == 10 && i == 1) {
                            V = V / 10;
                        }
                        if (K == 20 && i == 2) {
                            K = K / 10;
                        }
                        if (Z == 30 && i == 3) {
                            Z = Z / 10;
                        }
                        }
                        if (L == 70) {
                            L = L / 10;
                        }

                        if (!ERR) {
                        if (L == 70) {
                            L = L / 10;
                        }
                        counterOK++;
                        System.out.printf("[%d]-верен ход : :", counterOK++);
                    }
                }
            }
        }
    }
    public static void printStatus(){
    System.out.println();
    System.out.print("Състояние (независимо дали има конфликт) : ");
    System.out.printf("Вълкът е : %d  ; ", V);
    System.out.printf("Козата е : %d  ; ", K);
    System.out.printf("Зелката е : %d  ; ", Z);
    System.out.printf("Лодката е : %d  ; ", L);
    System.out.println();
    }}
