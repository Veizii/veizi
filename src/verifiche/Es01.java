/*
 Scrivere un programma che, dato un numero intero, stabilisca se è pari o dispari.
 */
package verifiche;

import java.util.Scanner;

public class Es01 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int num;  /*dichiarazione variabili*/
        int resto;

        System.out.println("Inserisci un intero:");
        num = input.nextInt();

        resto = num % 2; /*il resto si calcola dividendo 2 numeri, 
        se il risultato di una divisione tra due numeri è 0 allora il numero è pari altrimenti è dispari*/

        if (resto == 0) {
            System.out.println("numero pari");
            
        }else{
            System.out.println("numero dispari");
    }
    }
}