/*
Scrivere un programma che, data una sequenza di numeri
chiusa dallo zero, calcoli la somma dei quadrati nell’ambito della sequenza
escluso lo zero. DO WHILE
 */
package eserciziLab;

import java.util.Scanner;

public class Es11 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int num = 0;
        int somma = 0;

        do {
            System.out.println("inserisci un numero");
            num = input.nextInt();
            somma = somma + (num*num);
        } while (num != 0);
        System.out.println("somma=" + somma);
    }

}
