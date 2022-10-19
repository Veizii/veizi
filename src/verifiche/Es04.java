/*
 Scrivere un programma che calcoli la somma dei primi n numeri interi pari e la media dei dispari utilizzando il ciclo while.
 */
package verifiche;

import java.util.Scanner;

public class Es04 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i = 0;
        int n;
        int num1 = 0;
        /* ho aggiunto 2 num perchè se usavo 
        lo stesso i numeri dispari partivano da 1 invece quelli pari da 0*/
        int num = 1;
        int dispari;
        int somma = 0;
        int pari;
        int media = 0;
        int risultato;

        System.out.println("quanti numeri interi vuoi visualizzare?:");
        n = input.nextInt();

        while (i < n) {
            pari = (num * 2);
            /*così facendo ottengo un numero pari*/
            somma = somma + pari;
            
            dispari = (num1 * 2) + 1;
            /*un numero dispari si ottiene facendo 2n+1*/
            media = (media + dispari);/* media diventa una variabile 
            contatore infatti man mano che vengono visualizzati i numeri
            il loro valore totale viene inserito dentro somma
             */

            i++;
            num++;
            num1++;

        }
        risultato = media / n; /* divido somma per il numero dei valori visualizzati*/
        System.out.println("somma:" + somma);
        System.out.println("media:" + risultato);
    }
}
