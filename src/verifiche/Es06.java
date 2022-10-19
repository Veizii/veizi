/*
 Scrivere un programma che, dato un vettore contenente n parole scelte dall’utente le memorizzi in un altro vettore in senso inverso; visualizzare i due vettori per confrontarne il contenuto.
 */
package verifiche;

import java.util.Arrays;
import java.util.Scanner;

public class Es06 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int nParole;

        System.out.println("inserire quante parole si vuole visualizzare");
        nParole = input.nextInt();
        String[] vettparole = new String[nParole];
        String[] vettInverso = new String[nParole];

        for (int i = 0; i < nParole; i++) {
            System.out.println("Parola n." + (i + 1) + " : ");
            vettparole[i] = input.next();
            vettInverso[(nParole - 1) - i] = vettparole[i];
        }

        System.out.println(Arrays.toString(vettparole));
        System.out.println(Arrays.toString(vettInverso));

    }
}
