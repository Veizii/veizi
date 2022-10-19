/*
Scrivere un programma che calcoli le frequenze (assoluta,
relativa e percentuale) di 100 numeri interi compresi tra 1 e 10 generati
casualmente. (numeri casuali)
 */
package eserciziLab;

import java.util.Random;

public class Es14 {

    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();

        int numeroElementi = 100;

        int numeroFrequenze = 10;

        int[] numeri = new int[numeroElementi];

        int[] frequenze = new int[numeroFrequenze];

        for (int i = 0; i < numeroElementi; i++) {
            numeri[i] = rand.nextInt(10)+1;
            switch (numeri[i]) {
                case 1:
                    frequenze[0]++;
                    break;
            }
        }
        System.out.print("Numero1: "+ frequenze[0] + "  ");
        System.out.print((float)frequenze[0]/numeroElementi+"  ");
        System.out.println((int)(((float)frequenze[0]/numeroElementi)*100)+ "%");

    }
}
