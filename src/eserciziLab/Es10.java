/*
Scrivere un programma che, dato in input il numero
corrispondente al mese dell’anno, visualizzi il numero di giorni di cui è
composto.
 */
package eserciziLab;

import java.util.Scanner;

public class Es10 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int num1;

        System.out.println("inserisci il numero del mese:");
        num1 = input.nextInt();
        switch (num1) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("gennaio: 31 giorni");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("aprile: 30 giorni");
                break;
            case 2:
                System.out.println("febbraio: 28 giorni o 29 giorni ");
                break;

        }

    }

}
