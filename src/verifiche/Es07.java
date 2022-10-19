/*
Scrivere un programma che, generato un numero casuale intero in un intervallo compreso tra 1 e 10, chieda all’utente di indovinarlo in un numero limitato di tentativi. Stabilire 3 livelli di difficoltà: facile(5), medio(3) e difficile(2). Od ogni tentativo il programma deve comunicare se il numero scelto è più alto o più basso di quello da indovinare.
 */
package verifiche;

import java.util.Random;
import java.util.Scanner;

public class Es07 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, num, liv, tentativi;
        boolean k = false;
        Random r = new Random();
        n = r.nextInt(10) + 1;

        System.out.println("prova a indovinare");
        System.out.println("inserire il livello di difficoltà: 1 facile,2 medio,3 difficile");
        liv = input.nextInt();

        if (liv == 1) {
            tentativi = 5;
        } else if (liv == 2) {
            tentativi = 3;
        } else {
            tentativi = 2;
        }
        for (int i = 0; i < tentativi; i++) {
            System.out.println("inserisci un numero");
            num = input.nextInt();
            if (n == num) {
                k = true;
                i=tentativi;
            } else if (n < num) {
                System.out.println("il numero e' piu' basso");
            } else if (n > num) {
                System.out.println("il numero e' piu' alto");

            }

        }
        if (k) {
            System.out.println("HAI VINTO!");
        } else {
            System.out.println("HAI PERSO!");
        }
    }
}
